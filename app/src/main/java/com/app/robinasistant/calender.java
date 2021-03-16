package com.app.robinasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.widget.TableRow;

import java.util.Calendar;

public class calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableRow row1 =  findViewById(R.id.row1);
        TableRow row2 =  findViewById(R.id.row2);
        TableRow row3 =  findViewById(R.id.row3);
        TableRow row4 =  findViewById(R.id.row4);

        TableRow[] rows = {row1,row2,row3,row4};

        Calendar date = Calendar.getInstance();

        for(int i=0 ;i<rows.length;i++){
            for(int j=0;j<7;j++){


            }
        }


        setContentView(R.layout.activity_calender);

    }
}