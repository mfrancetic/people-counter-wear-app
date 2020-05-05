package com.example.peoplecounterwearapp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView counterTextView;
    private Button resetButton;
    private Button incrementButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counter_text_view);
        resetButton = findViewById(R.id.reset_button);
        incrementButton = findViewById(R.id.increment_button);

        counterTextView.setText("0");

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}