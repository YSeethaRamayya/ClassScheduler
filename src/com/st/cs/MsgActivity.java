package com.st.cs;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MsgActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_msg);
		
		Button btn=(Button)findViewById(R.id.btnsendstudent);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText phonenum=(EditText)findViewById(R.id.txtphonenumber);
				EditText Msg=(EditText)findViewById(R.id.txtmsg);
				
							
				String phone=phonenum.getText().toString();
				String Message=Msg.getText().toString()+" Please Pass this All Ur Friends";
				
				 try {
	    	         SmsManager smsManager = SmsManager.getDefault();
	    	         smsManager.sendTextMessage(phone, null, Message, null, null);
	    	         Toast.makeText(getApplicationContext(), "SMS sent to  "+phone,
	    	         Toast.LENGTH_LONG).show();
	    	      } catch (Exception e) {
	    	         Toast.makeText(getApplicationContext(),
	    	         "SMS faild, please try again.",
	    	         Toast.LENGTH_LONG).show();
	    	         e.printStackTrace();
	    	      }
				// TODO Auto-g
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.msg, menu);
		return true;
	}

}
