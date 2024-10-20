package com.rimdome.greetingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = findViewById(R.id.nameEditText);
        nameEditText.setHintTextColor(getResources().getColor(R.color.white));
        Button greetButton = findViewById(R.id.greetButton);
        TextView greetingTextView = findViewById(R.id.greetingTextView);
        ImageView flowerImageView = findViewById(R.id.flowerImageView);

        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                if (!name.isEmpty()) {
                    greetingTextView.setText("Hello " + name + ", \nBless you!");
                    greetingTextView.setVisibility(View.VISIBLE);
                    flowerImageView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}