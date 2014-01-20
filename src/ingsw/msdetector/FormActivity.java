package ingsw.msdetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FormActivity extends Activity 
{
		Button b;
		
		protected void onCreate(Bundle savedInstanceState)
		{	
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.form_activity);
			b = (Button) findViewById(R.id.Back);
			b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					finish();
					
				}
			});
			{
				
				
			}
			
			
		}
	
}
