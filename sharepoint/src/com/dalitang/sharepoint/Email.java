package com.dalitang.sharepoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements OnClickListener{

	EditText personsEmail, intro, personsName, stupidThings, hatefulAction,
	outro;
    String emailAdd, beginning, name, stupidAction, hatefulAct, out;
    Button sendEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//
		setContentView(R.layout.email);
		//initialize properties 
		initializeVar();
		sendEmail.setOnClickListener(this);
	}
	private void initializeVar() {
		// TODO Auto-generated method stub
		personsEmail= (EditText) findViewById(R.id.etEmails);
		intro = (EditText) findViewById(R.id.etIntro);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		convertETVarsIntoString();
		String emailaddress[]={emailAdd};
		String message = "Well hello "
				+name
				+" I just wanted to say"
				+beginning
				+". Not only that but I hate when you "
				+stupidAction
				+", that just really makes me crazy. I just want to make you "
				+hatefulAct
				+". Welp, thats "
				+out;
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "I hate you!");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
	}
	private void convertETVarsIntoString() {
		// TODO Auto-generated method stub
		emailAdd = personsEmail.getText().toString();
		beginning = intro.getText().toString();
		name = personsName.getText().toString();
		stupidAction = stupidThings.getText().toString();
		hatefulAct = hatefulAction.getText().toString();
		out = outro.getText().toString();
	}

}
