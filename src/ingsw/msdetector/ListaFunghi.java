package ingsw.msdetector;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaFunghi extends Activity
{
   ListView list;
   SchedeAdapter adapter;
	
	@Override
   protected void onCreate(Bundle savedInstanceState)
   {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.lista_schede_funghi);
	   list = (ListView) findViewById(R.id.lista);
	   adapter = new SchedeAdapter(this,R.layout.row_item,new ArrayList<Schede>());
	   list.setAdapter(adapter);
   
	   new BackgroundWorker().execute();
   }
	
	private class BackgroundWorker extends AsyncTask<Void, Schede, Void>
	{

		@Override
		protected void onPreExecute() 
		{
			adapter.clear();
			super.onPreExecute();
		}
		
		@Override
		protected Void doInBackground(Void... params) {
			
			Schede[] schede = { new Schede("Coppitedo"),new Schede("Lardito"),new Schede("Ovuli")};
			
			Random r = new Random();
			
			for(int i=0;i<schede.length;i++)
			{
				publishProgress(schede[r.nextInt(schede.length)]);
				
			}
			
			return null;
		}
		
		@Override
		protected void onProgressUpdate(Schede... values)
		{
			adapter.add(values[0]);
			super.onProgressUpdate(values);
		}
	}
}
