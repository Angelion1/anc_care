package com.anc.codegurus.pregacare;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.anc.codegurus.pregacare.Utilities.PreferenceManager;

import java.util.Calendar;

public class NotificationClick3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_click3);

        final PreferenceManager pm = new PreferenceManager(this);
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        Toast.makeText(NotificationClick3.this, "Well Done!!", Toast.LENGTH_SHORT).show();
                        pm.setAnc3(false);
                        NotificationClick3.this.finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        Toast.makeText(NotificationClick3.this, "Hurry up!!", Toast.LENGTH_SHORT).show();
                        // TODO: 04-Feb-17 Display Warnings
                        createNotification();
                        NotificationClick3.this.finish();
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(NotificationClick3.this);
        builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }

    private void createNotification() {
        Log.d("notify", "Yaha aya");

        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_YEAR, Calendar.DAY_OF_YEAR + 7);


        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, NotificationReciever.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//      alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime() + 60 * 1000, alarmIntent);
        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), alarmIntent);
    }
    }
