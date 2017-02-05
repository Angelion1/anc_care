package com.anc.codegurus.pregacare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAnc_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anc_info);

        Button btninfo = (Button) findViewById(R.id.btn_ancInfo);
        Button btnvisit1 = (Button) findViewById(R.id.btn_ancVisit1);
        Button btnvisit2 = (Button) findViewById(R.id.btn_ancVisit2);
        Button btnvisit3 = (Button) findViewById(R.id.btn_ancVisit3);
        Button btnvisit4 = (Button) findViewById(R.id.btn_ancVisit4);

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), Activityinfoanc.class);
                startActivity(myIntent);

            }
        });

        btnvisit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityVisit1.class);
                startActivity(myIntent);

            }
        });

        btnvisit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent( view.getContext(), ActivityVisit2.class);
                startActivity(myIntent);
            }
        });

        btnvisit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityVisit3.class);
                startActivity(myIntent);

            }
        });

        btnvisit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ActivityVisit4.class);
                startActivity(myIntent);
            }
        });


    }
}
