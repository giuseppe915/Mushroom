package ingsw.msdetector;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.support.v4.app.FragmentActivity; 



public class MapsActivity extends Activity 
{
  
	 private  LatLng userMark;
	 private GoogleMap mMap;
	 Location userLocation;
	 LatLng currLat;
	 LatLng currLong;
	 
	 
  protected void onCreate( Bundle savedInstanceState) {

	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.maps_activity);
	  
	  mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	  mMap.setMyLocationEnabled(true);
	  final LocationManager locManager = (LocationManager) getSystemService(LOCATION_SERVICE);
      final Criteria c = new Criteria();
      c.setAccuracy(Criteria.ACCURACY_FINE);
      userLocation = locManager.getLastKnownLocation(locManager.getBestProvider(c,
                      false));
      LocationListener lListener = new LocationListener()
      {

		@Override
		public void onLocationChanged(Location location)
		{
	    	  userMark = new LatLng(location.getLatitude(), location.getLongitude());
	    	  mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userMark, 13));
	    	  mMap.addMarker(new MarkerOptions().title("Tu").snippet("tu sei qui...forse").position(userMark));
		}
    	  
      };
      //Se è null l'utente non ha il gps attivo percui gli presentiamo la schermata dove può attivarlo
      if (userLocation == null) {
              Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
              startActivity(intent);
                 
      }
      else
      {
    	  
    	  userMark = new LatLng(userLocation.getLatitude(), userLocation.getLongitude());
    	  mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userMark, 13));
    	  mMap.addMarker(new MarkerOptions().title("Tu").snippet("tu sei qui...forse").position(userMark)); 
      }
			     
      
      
  }
  
 
  public void setPosition()
  {
	  userMark = new LatLng(userLocation.getLatitude(), userLocation.getLongitude());
	  mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userMark, 13));
	  mMap.addMarker(new MarkerOptions().title("Tu").snippet("tu sei qui...forse").position(userMark));
  
  }
  
  
  
  public boolean onCreateOptionsMenu(Menu menu)
	{
		
		
		MenuItem comando1 = menu.add("Indietro");
      comando1.setOnMenuItemClickListener(new OnMenuItemClickListener(){
		
			public boolean onMenuItemClick(MenuItem item) {
		
				finish();
				return true;
			}
	});
	return true;	
	}
	     

}
