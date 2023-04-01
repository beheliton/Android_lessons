package ru.mirea.hairzamanovrafaelrustemovich.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View view) {
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

        String currentTime = dateString.substring(11);

        int number = 21;
        String square = String.valueOf(number * number);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra("current_time", currentTime);

        startActivity(intent);
    }
}