package com.anc.codegurus.pregacare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPMSMA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmsm);
        TextView tv = (TextView) findViewById(R.id.txtPmsma);
        tv.setText("Goal of the PMSMA\n" +
                "\n" +
                "Pradhan Mantri Surakshit Matritva Abhiyan envisages to improve the quality and coverage of Antenatal Care (ANC) including diagnostics and counselling services as part of the Reproductive Maternal Neonatal Child and Adolescent Health (RMNCH+A) Strategy.\n" +
                "\n" +
                "Objectives of the program:\n" +
                "\n" +
                "Ensure at least one antenatal checkup for all pregnant women in their second or third trimester by a physician/specialist\n" +
                "Improve the quality of care during ante-natal visits. This includes ensuring provision of the following services:\n" +
                "All applicable diagnostic services\n" +
                "Screening for the applicable clinical conditions\n" +
                "Appropriate management of any existing clinical condition such as Anaemia, Pregnancy induced hypertension, Gestational Diabetes etc.\n" +
                "Appropriate counselling services and proper documentation of services rendered\n" +
                "Additional service opportunity to pregnant women who have missed ante-natal visits\n" +
                "Identification and line-listing of high risk pregnancies based on obstetric/ medical history and existing clinical conditions.\n" +
                "Appropriate birth planning and complication readiness for each pregnant woman especially those identified with any risk factor or comorbid condition.\n" +
                "Special emphasis on early diagnosis, adequate and appropriate management of women with malnutrition.\n" +
                "Special focus on adolescent and early pregnancies as these pregnancies need extra and specialized care\n" +
                "Key Features of PMSMA\n" +
                "\n" +
                "PMSMA is based on the premise — that if every pregnant woman in India is examined by a physician and appropriately investigated at least once during the PMSMA and then appropriately followed up — the process can result in reduction in the number of maternal and neonatal deaths in our country.\n" +
                "Antenatal checkup services would be provided by OBGY specialists / Radiologist/physicians with support from private sector doctors to supplement the efforts of the government sector.\n" +
                "A minimum package of antenatal care services (including investigations and drugs) would be provided to the beneficiaries on the 9th day of every month at identified public health facilities (PHCs/ CHCs, DHs/ urban health facilities etc) in both urban and rural areas in addition to the routine ANC at the health facility/ outreach.\n" +
                "Using the principles of a single window system, it is envisaged that a minimum package of investigations (including one ultrasound during the 2nd trimester of pregnancy) and medicines such as IFA supplements, calcium supplements etc would be provided to all pregnant women attending the PMSMA clinics.\n" +
                "While the target would reach out to all pregnant women, special efforts would be made to reach out to women who have not registered for ANC (left out/missed ANC) and also those who have registered but not availed ANC services (dropout) as well as High Risk pregnant women.\n" +
                "OBGY specialists/ Radiologist/physicians from private sector would be encouraged to provide voluntary services at public health facilities where government sector practitioners are not available or inadequate.\n" +
                "Pregnant women would be given Mother and Child Protection Cards and safe motherhood booklets.\n" +
                "One of the critical components of the Abhiyan is identification and follow up of high risk pregnancies. A sticker indicating the condition and risk factor of the pregnant women would be added onto MCP card for each visit:\n" +
                "Green Sticker- for women with no risk factor detected\n" +
                "Red Sticker – for women with high risk pregnancy\n" +
                "A National Portal for PMSMA and a Mobile application have been developed to facilitate the engagement of private/ voluntary sector.\n" +
                "‘IPledgeFor9’ Achievers Awards have been devised to celebrate individual and team achievements and acknowledge voluntary contributions for PMSMA in states and districts across India.");

    }
}
