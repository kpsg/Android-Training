package com.tavant.formvalidation;







import android.support.v7.app.ActionBarActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spinner = (Spinner) findViewById(R.id.age_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.age_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		///Spinner spinner = (Spinner) findViewById(R.id.age_spinner);
		//spinner.setOnItemSelectedListener((OnItemSelectedListener) this);
		Spinner spinner1 = (Spinner) findViewById(R.id.gender_spinner);
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.gender_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(adapter1);
		Button button1 = (Button)findViewById(R.id.button1);
		
		button1.setOnClickListener(buttonClickListener);
		
	}
	
	private OnClickListener buttonClickListener = new OnClickListener() {

	    @Override
	    public void onClick(View v){
	    	Log.e("message", "working");

			Intent intent = new Intent(MainActivity.this,DisplayDataActivity.class);
			Bundle extras = new Bundle();
			EditText name = (EditText) findViewById(R.id.edit_name);
			EditText experience = (EditText) findViewById(R.id.edit_experience);
			EditText email = (EditText) findViewById(R.id.edit_email);
			EditText phone = (EditText) findViewById(R.id.edit_phone);
			extras.putString("name",name.getText().toString());
			extras.putString("experience",experience.getText().toString());
			extras.putString("email",email.getText().toString());
			extras.putString("phone",phone.getText().toString());
			intent.putExtras(extras);
			startActivity(intent);
	        }
	    };
	

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
	
	/*public class SpinnerActivity extends Activity implements OnItemSelectedListener {
	   
	    
	    public void onItemSelected(AdapterView<?> parent, View view, 
	            int pos, long id) {
	        // An item was selected. You can retrieve the selected item using
	        // parent.getItemAtPosition(pos)
	    	parent.getItemAtPosition(pos);
	    }

	    public void onNothingSelected(AdapterView<?> parent) {
	        // Another interface callback
	    }
	}*/
	
}
