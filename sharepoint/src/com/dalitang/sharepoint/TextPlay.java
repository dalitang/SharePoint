package com.dalitang.sharepoint;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

//every time we 'implement' a class we 'must' use all the method in that class
//but 'extends' a class we 'can' use the methods in that class
public class TextPlay extends Activity implements View.OnClickListener{

	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//set the view as created xml
		setContentView(R.layout.text);
		
		//Like Property!
		baconAndEggs();
		//

		
		//View.OnClickListener() is an inner class
		//replaced by onclicklistener class
		//This is a classic this usage
		passTog.setOnClickListener(this);
		
		chkCmd.setOnClickListener(this);
	}

	private void baconAndEggs() {
		// TODO Auto-generated method stub
		chkCmd = (Button) findViewById(R.id.bResults);
		//Using final keywords because of inner class
		passTog = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tvResults);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bResults:
			String check = input.getText().toString();
			if(check.contentEquals("left")){
				//
				display.setGravity(Gravity.LEFT);
			}else if(check.contentEquals("center")){
				//
				display.setGravity(Gravity.CENTER);
			}else if(check.contentEquals("right")){
				//
				display.setGravity(Gravity.RIGHT);
			}else if(check.contentEquals("blue")){
				//
			}else if(check.contentEquals("WTF")){
				//
				Random crazy = new Random();
				display.setText("WFT!!!!!!!");
				display.setTextSize(crazy.nextInt(75));
				display.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
				switch(crazy.nextInt(3)){
				case 0:
					display.setGravity(Gravity.LEFT);
					break;
				case 1:
					display.setGravity(Gravity.CENTER);
					break;
				case 2:
					display.setGravity(Gravity.RIGHT);
					break;
				}
			}else{
				display.setText("invalid");
				display.setGravity(Gravity.CENTER);
			}
			break;
		case R.id.tbPassword:
			if(passTog.isChecked()){
				input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}else{
				input.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;
		case R.id.etCommands:
			///
			break;
		case R.id.tvResults:
			////
			break;
		}
	}

}
