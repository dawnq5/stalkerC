package com.d.stalker;

import com.d.stalker.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	MinaClient client;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		client=new MinaClient(this);
		new Thread(client).start();
	}
	public void send(View v){
		EditText et=(EditText)findViewById(R.id.message);
		Message  message=new Message();
		message.setToUser("user2");
		message.setMessage(et.getText().toString());
		client.sendMessage(message);
	}
}
