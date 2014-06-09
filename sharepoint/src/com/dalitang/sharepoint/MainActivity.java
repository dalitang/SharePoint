package com.dalitang.sharepoint;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	
    static int counter=0;
	//Button add, sub;
//	TextView display = (TextView) findViewById(R.id.tvDisplay);


	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
       

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    //static class cannot be subclassed
    //it belongs to upper class rather than an object
    public static class PlaceholderFragment extends Fragment {
        
    	public PlaceholderFragment() {

        }
        

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            //add the Button listener here START!!!!!
            Button add = (Button) rootView.findViewById(R.id.bAdd);
            Button sub = (Button) rootView.findViewById(R.id.bSub);
            //final means you cannot change the reference
            //but not the contains of object!!!!
            //However you cannot change a final variable!!!
            final TextView display=(TextView) rootView.findViewById(R.id.tvDisplay);
            //the onCreateView is a method not a class!
            //so call setOnClickListener is just a call!
            add.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View view) {
//    				Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
    			counter++;
    			//setText is final method 
    			display.setText("You total is " + counter);
    			}

    		});
            sub.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View view) {
//    				Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
    			counter--;
    			display.setText("You total is " + counter);
    			}

    		});
            return rootView;
        }
        

    }
    

    
//    public void sendMessageAdd(View view) {
//        // Do something in response to button click
//        //counter=0;
//
//        Button add=(Button) findViewById(R.id.bAdd);


}
