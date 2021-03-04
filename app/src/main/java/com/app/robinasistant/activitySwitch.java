package com.app.robinasistant;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activitySwitch extends AppCompatActivity {
    private static activitySwitch mContext;

    public ArrayList<Integer> values = new ArrayList<Integer>();


    private Class[] list = {
            ChooseUser.class
    };


    public void Switch( int selected )
     {


        Intent intent = new Intent(activitySwitch().getC,            ChooseUser.class);
        startActivity(intent);
    }




}
