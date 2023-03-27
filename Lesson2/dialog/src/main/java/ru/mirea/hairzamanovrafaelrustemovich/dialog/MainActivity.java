package ru.mirea.hairzamanovrafaelrustemovich.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    private TextView textView;

    public void onClickTimeDialog(View view) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment(textView);
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickDateDialog(View view) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickProgressDialog(View view) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}