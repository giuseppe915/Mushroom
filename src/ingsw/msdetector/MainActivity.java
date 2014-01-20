package ingsw.msdetector;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity
{
	ImageButton loginButton;
	ImageButton formButton;
	ImageButton PlaceholderButton;
	
   public void onCreate(Bundle savedInstanceState)
   {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	addListenerOnButton();
   }
   
   public void addListenerOnButton()
   {
	   formButton = (ImageButton) findViewById(R.id.FormButton);
	   
		formButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

			 Intent i = new Intent(MainActivity.this,FormActivity.class);
			 startActivity(i);

			}
		});
		
		PlaceholderButton = (ImageButton) findViewById(R.id.SegnapostiButton);
		
		PlaceholderButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v){
				
				Intent i = new Intent(MainActivity.this,PlaceHolderActivity.class);
				startActivity(i);
			}
		});
		
		loginButton = (ImageButton) findViewById(R.id.LoginButton);
		
		loginButton.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v)
			{
				Intent i = new Intent(MainActivity.this,LoginActivity.class);
				startActivity(i);
			}
						
		});
   }	
   
 

}