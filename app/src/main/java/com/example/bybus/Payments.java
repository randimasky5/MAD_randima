package com.example.bybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
    }

    public void Back2home(View v) {
        Intent i = new Intent(Payments.this, Main5Activity.class);
        startActivity(i);


    }
}
