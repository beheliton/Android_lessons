package ru.mirea.hairzamanovrafaelrustemovich.intentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String currentTime = getIntent().getStringExtra("current_time");

        int number = 21;
        String square = String.valueOf(number * number);

        String message = "Квадрат значения моего номера по списку в группе составляет: " + square + "\n" +
                "Текущее время: " + currentTime;

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}