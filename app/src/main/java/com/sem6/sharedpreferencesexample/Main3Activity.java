package com.sem6.sharedpreferencesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        back = findViewById(R.id.buttonBack);
        textView = findViewById(R.id.textView);

        SharedPreferences result = getSharedPreferences("saveData", Context.MODE_PRIVATE);

        String value = result.getString("value", "not found");
        textView.setText(value);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                finish();
            }
        });
    }
}
