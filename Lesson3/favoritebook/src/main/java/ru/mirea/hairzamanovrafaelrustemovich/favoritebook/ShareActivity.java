package ru.mirea.hairzamanovrafaelrustemovich.favoritebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    private TextView bookTitleTextView;
    private EditText bookTitleEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        bookTitleTextView = findViewById(R.id.developer_book_text_view);
        bookTitleEditText = findViewById(R.id.book_title_edit_text);
        submitButton = findViewById(R.id.share_button);

        bookTitleTextView.setText("Любимая книга разработчика - " + getBookTitle());

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newBookTitle = bookTitleEditText.getText().toString();
                setBookTitle(newBookTitle);
                bookTitleTextView.setText("Название Вашей любимой книги: " + getBookTitle());
                Intent returnIntent = new Intent();
                returnIntent.putExtra("bookTitle", newBookTitle);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }

    private String getBookTitle() {
        SharedPreferences sharedPrefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        return sharedPrefs.getString("bookTitle", "Тут появится название вашей любимой книги!");
    }

    private void setBookTitle(String bookTitle) {
        SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
        editor.putString("bookTitle", bookTitle);
        editor.apply();
    }
}