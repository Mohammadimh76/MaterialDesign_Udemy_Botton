package com.example.udemybotton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raisedButton;
    AppCompatButton flatButton;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raisedButton = findViewById(R.id.raised_btn);
        flatButton = findViewById(R.id.flat_btn);
        fab = findViewById(R.id.fab_btn);

        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Raised Button! :)", Toast.LENGTH_SHORT).show();
            }
        });

        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Flat Button! :)", Toast.LENGTH_SHORT).show();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Floatin Action Button! :)", Toast.LENGTH_SHORT).show();
            }
        });

    }//The last method onCreate
}//The last Class MainActivity
