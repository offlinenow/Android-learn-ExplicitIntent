package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class displayMessageActivity extends AppCompatActivity {
    public final static String EXTRA_STRING = "com.example.myapplication.displayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.TextView1);
        textView.setTextSize(40);
        textView.setText(message);
    }

    public void sendMessageBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = ((EditText) findViewById(R.id.EditText2)).getText().toString();
        intent.putExtra(EXTRA_STRING, message);
        startActivity(intent);
    }
}
