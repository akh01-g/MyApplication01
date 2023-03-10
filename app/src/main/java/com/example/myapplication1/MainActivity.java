package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.ExifInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numberTextView = findViewById(R.id.numberTextView);
        numberTextView.setText(Integer.toString(0));

        Button button = findViewById(R.id.plusBtn);
        button.setOnClickListener(view -> {
            count++;
            numberTextView.setText(count+"");
        });

        Button button1 = findViewById(R.id.minusBtn);

        button1.setOnClickListener(view -> {
            count--;
            numberTextView.setText(count+"");
        });

        Button button2 = findViewById(R.id.resetBtn);

        button2.setOnClickListener(view -> {
            count = 0;
            numberTextView.setText("0");
        });

        Button button3 = findViewById(R.id.aboutBtn);

        button3.setOnClickListener(view -> {
            Intent aboutus = new Intent(this, AboutUs.class);
            startActivity(aboutus);
        });

        Button button4 = findViewById(R.id.exitBtn);

        button4.setOnClickListener(view -> {
            finish();
        });
    }
}