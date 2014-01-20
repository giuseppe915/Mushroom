package ingsw.msdetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public class LoginActivity extends Activity
{
	
	
		protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.login_activity);
			
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
