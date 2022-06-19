package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private EditText editText;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editTextOne);
        textResult = (TextView) findViewById(R.id.resultText);

        button.setText("Ollolo");
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String srcText = editText.getText().toString();
        String result = srcText.toUpperCase();
        textResult.setText(result);
    }
}