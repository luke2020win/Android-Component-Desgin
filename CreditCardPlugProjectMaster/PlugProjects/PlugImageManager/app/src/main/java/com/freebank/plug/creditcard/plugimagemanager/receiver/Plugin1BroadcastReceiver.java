package com.freebank.plug.creditcard.plugimagemanager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.freebank.plug.creditcard.pluginutils.DLog;

public class Plugin1BroadcastReceiver extends BroadcastReceiver {

    private final String TAG = "Plugin1BroadcastReceiver";


    public static final String ACTION = "com.freebank.plug.creditcard.plugimagemanager.receiver.ACTION1_TEST";

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        if (ACTION.equals(action)) {
            final String extra = intent.getStringExtra("extra");
            Toast.makeText(context, "receiver action: " + action + ", extra: " + extra, Toast.LENGTH_LONG).show();
            DLog.i(TAG, "onReceive() action: " + action + ", context: " + context + ", extra" + extra);
        }
    }
}
