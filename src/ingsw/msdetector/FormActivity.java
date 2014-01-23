package ingsw.msdetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FormActivity extends Activity 
{
		
		
		protected void onCreate(Bundle savedInstanceState)
		{	
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.form_activity);
			
			
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
