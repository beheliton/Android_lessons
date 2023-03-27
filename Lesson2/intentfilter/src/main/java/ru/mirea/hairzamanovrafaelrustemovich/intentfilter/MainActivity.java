package ru.mirea.hairzamanovrafaelrustemovich.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBrowser(View view) {
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);
    }

    public void sendData(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);

        String fullName = "Хайрзаманов Рафаэль Рустэмович";
        String university = "МИРЭА";
        sendIntent.putExtra(Intent.EXTRA_TEXT, "ФИО: " + fullName + "\nУниверситет: "
                + university);
        sendIntent.setType("text/plain");

        startActivity(Intent.createChooser(sendIntent, "Отправить данные"));
    }
}