package com.titanroms.ltehelper;

import android.widget.Toast;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	//start the service
	public void onClickStartService(View V)
	{
		//start the service from here //LTEHelper is your service class name
		startService(new Intent(this, LTEHelper.class));
		Toast.makeText(this, "LTEHelper Started", Toast.LENGTH_LONG).show();

		Toast.makeText(this, "Change to LTE/CDMA auto", Toast.LENGTH_LONG).show();

                Intent i = new Intent();
                i.setClassName( "com.android.settings", "com.android.settings.RadioInfo" );
                startActivity(i);

	}
	//Stop the started service
	public void onClickStopService(View V)
	{
		//Stop the running service from here//LTEHelper is your service class name
		//Service will only stop if it is already running.
		stopService(new Intent(this, LTEHelper.class));
		Toast.makeText(this, "LTEHelper Stopped", Toast.LENGTH_LONG).show();
		Toast.makeText(this, "Change to CDMA auto", Toast.LENGTH_LONG).show();

                Intent s = new Intent();
                s.setClassName( "com.android.settings", "com.android.settings.RadioInfo" );
                startActivity(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
