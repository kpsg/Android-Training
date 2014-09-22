package com.tavant.formvalidation;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayDataActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_data);
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		TextView name = (TextView) findViewById(R.id.name_data);
				name.setText(extras.getString("name"));
		
		TextView experience = (TextView) findViewById(R.id.experience_data);
		experience.setText(extras.getString("experience"));
				
		TextView email = (TextView) findViewById(R.id.email_data);
		email.setText(extras.getString("email"));	
		
		TextView phone = (TextView) findViewById(R.id.phone_data);
		phone.setText(extras.getString("phone"));
		
		Button edit_button = (Button)findViewById(R.id.edit_button);
		
		edit_button.setOnClickListener(editClickListener);
		
		Button submit_button = (Button)findViewById(R.id.submit_button);
		
		submit_button.setOnClickListener(submitClickListener);
		
		
		//setContentView(name);
		
	}
	
	
	
	private OnClickListener editClickListener = new OnClickListener() {

	    @Override
	    public void onClick(View v){
	    	finish();

			
	        }
	    };
	    
	    private OnClickListener submitClickListener = new OnClickListener() {

		    @Override
		    public void onClick(View v){
		    	

				Intent intent2 = new Intent(DisplayDataActivity.this,SubmitActivity.class);
				startActivity(intent2);
		        }
		    };
		    
		   

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_data, menu);
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
}
