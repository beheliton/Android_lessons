package ru.mirea.hairzamanovrafaelrustemovich.multiactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String value = getIntent().getStringExtra("key");

        TextView textView = (TextView) findViewById(R.id.textView);
        String message = getIntent().getStringExtra("message");
        textView.setText(message);
    }
}