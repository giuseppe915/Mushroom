package ingsw.msdetector;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SchedeAdapter extends ArrayAdapter<Schede>
{
	private int resource;
	private LayoutInflater inflater;
	
	public SchedeAdapter(Context context,int resourceId,List<Schede> schede)
	{
		super(context,resourceId,schede);
		resource=resourceId;
		inflater=LayoutInflater.from(context);
	}
	
	@Override
	public View getView(int position, View v, ViewGroup parent) {
		
		Schede scheda = getItem(position);
		
		ViewHolder holder;
		
		if(v==null)
		{
			v=inflater.inflate(resource,parent,false);
			
			holder= new ViewHolder();
			
			holder.nomeTextView= (TextView) v.findViewById(R.id.Name);
			v.setTag(holder);
		}
		else
		{
			holder= (ViewHolder) v.getTag();
		}
		
		holder.nomeTextView.setText(scheda.getNome());
		
		return v;
	}
	
	public class ViewHolder
	{
		TextView nomeTextView;
	}
}
