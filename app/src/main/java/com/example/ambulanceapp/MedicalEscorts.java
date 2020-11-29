package com.example.ambulanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicalEscorts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_escorts);
    }

    public void BookDoctor(View view){
        Intent intent = new Intent(MedicalEscorts.this, BookDoctors.class);
        startActivity(intent);
    }

    public void BookNurse(View view){
        Intent bookNurseIntent = new Intent(MedicalEscorts.this, BookNurses.class);
        startActivity(bookNurseIntent);
    }

    public void BookParamedics(View view){
        Intent bookParaIntent = new Intent(MedicalEscorts.this, BookParamedics.class);
        startActivity(bookParaIntent);
    }
}