package com.jeremyfeinstein.slidingmenu.example;
import java.util.ArrayList;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView; 
import android.widget.TextView; 

public class ChooseRideAdapter extends ArrayAdapter<String> 
{   private Context context; 
	private ArrayList<String> txtdrivername;
	private ArrayList<String> txtcarname; 
	private ArrayList<String> txtdriverprice; 
	private ArrayList<String> imgcar;
	private ArrayList<String> imgperson;
	
	public ChooseRideAdapter(Context context, int resource,ArrayList<String> txtdrivername,ArrayList<String> txtcarname,ArrayList<String> txtdriverprice)
	{ 
		super(context, R.layout.list_chooseride, txtdrivername);
		this.context = context; this.txtdrivername = txtdrivername;
		this.context = context; this.txtcarname = txtcarname;
		this.context = context; this.txtdriverprice = txtdriverprice;
		
		this.context = context; this.imgcar = imgcar;
		this.context = context; this.imgperson = imgperson;
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{ 
		
	LayoutInflater inflater = (LayoutInflater) 
	context .getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
	View rowView = inflater.inflate(R.layout.list_chooseride, parent, false);
	
	TextView textView = (TextView) rowView.findViewById(R.id.label); 
	ImageView imageView = (ImageView) rowView.findViewById(R.id.logo); 
	ImageView imageperson = (ImageView) rowView.findViewById(R.id.imageperson); 
	
	TextView txt_trip_price = (TextView) rowView.findViewById(R.id.txt_trip_price); 
	TextView txtvehiclename = (TextView) rowView.findViewById(R.id.txtvehiclename); 
	
	textView.setText(txtdrivername.get(position)); 
	txt_trip_price.setText(txtdriverprice.get(position)); 
	txtvehiclename.setText(txtcarname.get(position)); 

	Uri imgUri= Uri.parse(imgperson.get(position).toString());
	imageperson.setImageURI(null); 
	imageperson.setImageURI(imgUri);
	
	Uri vehicleuri= Uri.parse(imgcar.get(position).toString());
	imageView.setImageURI(null); 
	imageView.setImageURI(vehicleuri);
	
	return rowView; 
	
	} 		
}