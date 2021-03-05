package com.app.robinasistant;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activitySwitch extends AppCompatActivity {
    private Context context;

    public ArrayList<Integer> values = new ArrayList<Integer>();
    private Class[] list = {
            ChooseUser.class
    };

    public void setContext(Context context){
       this.context=context;
    }

    public void Switch( int selected )
     {

        Intent intent = new Intent(context,ChooseUser.class);
         intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }




}
