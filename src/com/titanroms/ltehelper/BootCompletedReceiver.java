package com.titanroms.ltehelper;

import android.widget.Toast;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.content.BroadcastReceiver;
import android.content.Context;


public class BootCompletedReceiver extends BroadcastReceiver {

    final static String TAG = "BootCompletedReceiver";

    @Override
    public void onReceive(Context context, Intent arg1) {
	Intent serviceIntent = new Intent(context, LTEHelper.class);
	//Toast.makeText(this, "LTEHelper auto started", Toast.LENGTH_LONG).show();
        //Log.w(TAG, "auto starting LTEHelper service...");
        context.startService(serviceIntent);
    }
}
