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
    public static class PlaceholderFragment extends Fragment {
        
    	public PlaceholderFragment() {

        }
        

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            Button add = (Button) rootView.findViewById(R.id.bAdd);
            Button sub = (Button) rootView.findViewById(R.id.bSub);
            final TextView display=(TextView) rootView.findViewById(R.id.tvDisplay);
            add.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View view) {
//    				Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
    			counter++;
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
