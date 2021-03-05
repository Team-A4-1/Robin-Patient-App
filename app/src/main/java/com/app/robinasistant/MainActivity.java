package com.app.robinasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final TextView loginButton = (TextView) findViewById(R.id.Login2);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("test");
                activitySwitch Switch = new activitySwitch();
                Switch.setContext(getApplicationContext());
                Switch.Switch(0);

            }
        });
    }
}