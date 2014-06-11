package com.dalitang.sharepoint;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = {"MainActivity", "example1", "example2", "example3",
			"example4", "example5", "example6"};
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//create a list adapter
		//This is a common way to create a list
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		super.onListItemClick(l, v, position, id);
		
		//position is the key to "entrance" of an activity
		//that means every time click the menu list item
		//cheese will get the string contains the 'name'
		String cheese = classes[position];
		
		
		try {
			//Try to find the class name
			Class ourClass = Class.forName("com.dalitang.sharepoint." + cheese);
			//create the intent and start it
			Intent ourIntent = new Intent(Menu.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
