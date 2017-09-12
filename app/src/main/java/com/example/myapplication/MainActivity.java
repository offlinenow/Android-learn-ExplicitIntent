package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myapplication.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent() != null) {
            Intent intent = getIntent();
            String string = intent.getStringExtra(displayMessageActivity.EXTRA_STRING);
            TextView textView = findViewById(R.id.TextView2);
            textView.setText(string);
            textView.setTextSize(40);
        }
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, displayMessageActivity.class);
        EditText editText = findViewById(R.id.EditText1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void PopUpWindow(View view) {

    }

}
