package com.mirea.hairzamanovrafaelrustemovich.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private CheckBox checkBox ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        Button btnWhoAmI = findViewById(R.id.btnWhoAmI);
        Button btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        // Обработчик события клика на кнопке btnWhoAmI
        btnWhoAmI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Мой номер по списку № 21");
                // Изменяем состояние чекбокса на противоположное
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        // Обработчик события клика на кнопке btnItIsNotMe
        btnItIsNotMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Это не я сделал", Toast.LENGTH_SHORT).show();
                // Изменяем состояние чекбокса на противоположное
                checkBox.setChecked(!checkBox.isChecked());
            }
        });
    }

    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Это не я сделал", Toast.LENGTH_SHORT).show();
        // Изменяем состояние чекбокса на противоположное
        checkBox.setChecked(!checkBox.isChecked());
    }
}