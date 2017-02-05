package com.anc.codegurus.pregacare;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.anc.codegurus.pregacare.Utilities.Constants;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String ACTION = "com.example.android.receivers.NOTIFICATION_ALARM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnancinfo = (Button) findViewById(R.id.ancInfoButton);
        Button btnnutrition = (Button) findViewById(R.id.nutritionButton);
        Button btnriskFactor = (Button) findViewById(R.id.riskFactorsButton);
        Button btnPmsma = (Button) findViewById(R.id.PMSMAButton);



        btnancinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityAnc_info.class);
                startActivity(myIntent);
            }
        });

        btnnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), activityNutrition.class);
                startActivity(myIntent);
            }
        });

        btnriskFactor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityRisk.class);
                startActivity(myIntent);
            }
        });

        btnPmsma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityPMSMA.class);
                startActivity(myIntent);
            }
        });

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.mainProgressBar);
        TextView progressWeekText = (TextView) findViewById(R.id.mainweeksTextView);
       // TextView progressDayText = (TextView) findViewById(R.id.mainDaysTextView);
        Calendar c = Calendar.getInstance();
        int cur_day = c.get(Calendar.DAY_OF_YEAR);
        int preg_day = Constants.day;
        int diff_day = 0;
        if(cur_day<preg_day)
            diff_day = 365 - preg_day + cur_day;
        else
            diff_day = cur_day - preg_day;
        //Toast.makeText(MainActivity.this, diff_day, Toast.LENGTH_SHORT).show();
        int progressWeek = diff_day/7;
        progressWeekText.setText("Week " + progressWeek);
       // progressDayText.setText(diff_day);
        progressBar.setProgress(diff_day);
        createNotification();
    }

    private void createNotification() {
        Log.d("notify", "Yaha aya");
        /*AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(ACTION);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        alarmManager.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis(), alarmIntent);*/

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        AlarmManager alarmManager1 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, NotificationReciever.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        PendingIntent alarmIntent1 = PendingIntent.getBroadcast(this, 1, intent, PendingIntent.FLAG_ONE_SHOT);

        alarmManager.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis() + 5000, alarmIntent);

        alarmManager1.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis() + 15000, alarmIntent1);

        /*Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_YEAR, Constants.day + 56);
        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), alarmIntent);
        c.set(Calendar.DAY_OF_YEAR, Constants.day + 168);
        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), alarmIntent);
        c.set(Calendar.DAY_OF_YEAR, Constants.day + 217);
        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), alarmIntent);
        c.set(Calendar.DAY_OF_YEAR, Constants.day + 252);
        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), alarmIntent);
    */}
}
