package ru.mirea.hairzamanovrafaelrustemovich.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Метод onCreate() вызван");
    }

    @Override
    protected void onStart() {
        super.onStart();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onStart() вызван, текст: " + editText.getText().toString());
    }

    @Override
    protected void onResume() {
        super.onResume();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onResume() вызван, текст: " + editText.getText().toString());
    }

    @Override
    protected void onPause() {
        super.onPause();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onPause() вызван, текст: " + editText.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onStop() вызван, текст: " + editText.getText().toString());
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onRestart() вызван, текст: " + editText.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EditText editText = findViewById(R.id.editText);
        Log.d(TAG, "Метод onDestroy() вызван, текст: " + editText.getText().toString());
    }
}