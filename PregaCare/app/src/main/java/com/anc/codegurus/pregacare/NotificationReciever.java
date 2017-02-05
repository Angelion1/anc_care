package com.anc.codegurus.pregacare;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.anc.codegurus.pregacare.Utilities.PreferenceManager;

public class NotificationReciever extends BroadcastReceiver {
    public NotificationReciever() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Alarm Receiver", "onReceive called");
        PreferenceManager pm = new PreferenceManager(context);
        Log.d("Alarm Receiver", pm.isANC1()+"");
        if(pm.isANC1()) {
            Intent myIntent = new Intent(context, NotificationClick1.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, myIntent,
                    0);//Intent.FLAG_ACTIVITY_NEW_TASK);


            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.motherandchild2)
                            .setContentTitle("ANC1")
                            .setContentText("Your 1st visit is due!!")
                            .setContentIntent(pendingIntent)
                            .setAutoCancel(true);

            NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(1, mBuilder.build());
        }
        if(pm.isANC2()) {


            Intent myIntent = new Intent(context, NotificationClick2.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, myIntent,
                    0);//Intent.FLAG_ACTIVITY_NEW_TASK);


            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.motherandchild2)
                            .setContentTitle("ANC2")
                            .setContentText("Your 2nd visit is due!!")
                            .setContentIntent(pendingIntent)
                            .setAutoCancel(true);

            NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(1, mBuilder.build());
        }
        if(pm.isANC3()) {


            Intent myIntent = new Intent(context, NotificationClick3.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, myIntent,
                    0);//Intent.FLAG_ACTIVITY_NEW_TASK);


            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.motherandchild2)
                            .setContentTitle("ANC3")
                            .setContentText("Your 3rd visit is due!!")
                            .setContentIntent(pendingIntent)
                            .setAutoCancel(true);

            NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(1, mBuilder.build());
        }
        if(pm.isANC4()) {


            Intent myIntent = new Intent(context, NotificationClick4.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, myIntent,
                    0);//Intent.FLAG_ACTIVITY_NEW_TASK);


            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle("ANC4")
                            .setContentText("Your 4th visit is due!!")
                            .setContentIntent(pendingIntent)
                            .setAutoCancel(true);

            NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(1, mBuilder.build());
        }
    }
}
