package com.example.a652j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneCall extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getStringExtra(TelephonyManager.EXTRA_STATE) ==
                TelephonyManager.EXTRA_STATE_OFFHOOK) {
            Toast.makeText(context, "Phone call.......1", Toast.LENGTH_SHORT).show();

        } else if (intent.getStringExtra(TelephonyManager.EXTRA_STATE) ==
                TelephonyManager.EXTRA_STATE_IDLE) {
            Toast.makeText(context, "Canceled....!", Toast.LENGTH_LONG).show();

        } else if (intent.getStringExtra(TelephonyManager.EXTRA_STATE) ==
                TelephonyManager.EXTRA_STATE_RINGING) {
            Toast.makeText(context, "Ringing.....!", Toast.LENGTH_LONG).show();
        }
    }
}
