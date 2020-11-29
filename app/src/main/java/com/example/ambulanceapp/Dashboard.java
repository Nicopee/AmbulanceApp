package com.example.ambulanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void CalUs(View view){
        String phone = "232";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

    public void GetNearByAmbulance(View view){
        Intent intent = new Intent(Dashboard.this,  GoogleMapsActivity.class);
        startActivity(intent);
    }

    public void GetMedicalEscorts(View view){
        Intent medicalEscorts = new Intent(Dashboard.this, MedicalEscorts.class);
        startActivity(medicalEscorts);

    }

    public void GetMyTrainings(View view){
        Intent trainings = new Intent(Dashboard.this, Trainings.class);
        startActivity(trainings);
    }

}