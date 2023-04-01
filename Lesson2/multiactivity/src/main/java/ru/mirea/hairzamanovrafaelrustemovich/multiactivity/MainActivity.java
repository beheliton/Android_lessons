package ru.mirea.hairzamanovrafaelrustemovich.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Кнопка нажата!", Toast.LENGTH_SHORT)
                        .show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", "MIREA - HAIRZAMANOV RAFAEL RUSTEMOVICH");
                startActivity(intent);
            }
        });
    }

    public void sendData(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}