package com.titanroms.ltehelper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.app.Notification;
import android.app.PendingIntent;

public class LTEHelper extends Service{

    	private static final String TAG = "com.titanroms.ltehelper.ltewl";
	private WakeLock wakeLock;


	//private static final String TAG = "LTEHelper";

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {

		Log.d(TAG, "Created LTEHelper");


	}

	@Override
	public void onStart(Intent intent, int startId) {
		//Toast.makeText(this, "LTEHelper Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "Starting LTEHelper...");	

		PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);
		wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, TAG);
		wakeLock.acquire();



		//return(START_STICKY);

	}
	
	@Override
	public void onDestroy() {
		//Toast.makeText(this, "LTEHelper Stopped", Toast.LENGTH_LONG).show();
		Log.d(TAG, "Stopping LTEHelper");

		wakeLock.release();
	}
}
