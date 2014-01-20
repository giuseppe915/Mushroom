package ingsw.msdetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PlaceHolderActivity extends Activity {
	
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.placeholder_activity);
		b = (Button) findViewById(R.id.azzo);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				finish();
				
			}
			
			
		});
		
	}

	
}
