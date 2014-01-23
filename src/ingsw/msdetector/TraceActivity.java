package ingsw.msdetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TraceActivity extends Activity 
{
	Button nuovoPercorso;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trace_activity);
		
		nuovoPercorso = (Button) findViewById(R.id.Nuovo);
		nuovoPercorso.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i= new Intent(TraceActivity.this,MapsActivity.class);
				startActivity(i);
			}
		});
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
