package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView git, tube, mail;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        git = findViewById(R.id.github);
        git.setMovementMethod(LinkMovementMethod.getInstance());
        tube = findViewById(R.id.youtube);
        tube.setMovementMethod(LinkMovementMethod.getInstance());
        mail = findViewById(R.id.email);
        mail.setMovementMethod(LinkMovementMethod.getInstance());

    }
}