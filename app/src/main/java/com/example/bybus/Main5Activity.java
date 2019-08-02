package com.example.bybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void add_route(View v) {
        Intent i = new Intent(Main5Activity.this, Add_route.class);
        startActivity(i);
    }

    public void booking(View v) {
        Intent i = new Intent(Main5Activity.this, booking.class);
        startActivity(i);
    }

    public void payments(View v) {
        Intent i = new Intent(Main5Activity.this, Payments.class);
        startActivity(i);


    }

    public void my_routes(View v) {
        Intent i = new Intent(Main5Activity.this, My_route.class);
        startActivity(i);
    }
}
