package com.example.simpletodo;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.simpletodo.MainActivity.ITEM_TEXT;

public class EditItemActivity extends AppCompatActivity {

    // track edit text
    EditText etItemText;

    // position of edited item on list
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        // resolve edit text from layout
        etItemText = (EditText) findViewById(R.id.etItemText);

        // set edit text value from intent extra
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));




    }
}
