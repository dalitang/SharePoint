package com.dalitang.sharepoint;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

//
public class Splash extends Activity{

	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//Connect View group here
		setContentView(R.layout.splash);
		
		//
		ourSong = MediaPlayer.create(Splash.this, R.raw.abc);
		ourSong.start();
		
		//Create a Thread called timer 
		
		Thread timer = new Thread(){
			// run()
			public void run(){
				try{
					//stay on this page for 15 seconds
					sleep(15000);
					
				}catch(InterruptedException e){
					//if there is anything wrong 
					e.printStackTrace();
				}finally{
					//Call the second activity page
					//create the intent first
//					Intent openMainActivity = new Intent("com.dalitang.sharepoint.MainActivity");
					//start intent 
//					startActivity(openMainActivity);
				}
			}
		};
		timer.start();
	}

	//right-click -> source ->implement and override methods
	//because if call another activity, it will trigger the current activity onPause
	//the first activity is like going to "background"
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	
    
	
}
