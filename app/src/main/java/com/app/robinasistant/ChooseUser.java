package com.app.robinasistant;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ChooseUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        TableLayout clients = (TableLayout) findViewById(R.id.users);

        int amount = 6;
        LinearLayout linear =null;
        TableRow row =null;

for(int i=0;i<amount;i++){
        //create card view
        CardView corners = new CardView(this);
        corners.setId(View.generateViewId());
        corners.setLayoutParams(new FrameLayout.LayoutParams(
                360,
                360
        ));
        corners.setRadius(360);


        //create text
        TextView text = new TextView(this);
        text.setId(View.generateViewId());
        text.setTextSize(30);
        text.setText("name");


        //create imageview and set image
        ImageView picture = new ImageView(this);
        picture.setId(View.generateViewId());
        picture.setImageDrawable(getResources().getDrawable(R.drawable.mike_andrei_433));
        corners.addView(picture);


        //create constraint layout
        ConstraintLayout cons = new ConstraintLayout(this);
        cons.setId(View.generateViewId());
        cons.setLayoutParams(new ViewGroup.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        //add corneres
        cons.addView(corners);
        cons.addView(text);

//test

    if (i % 2 == 0) {

        //create linear layout
        linear = new LinearLayout(this);



        linear.setId(View.generateViewId());
        linear.setOrientation(LinearLayout.HORIZONTAL);




        //create tabel row
        row = new TableRow(this);
        row.addView(linear);
        //add  row to table
        clients.addView(row);
    }
        linear.addView(cons);






        // constrain set start
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(cons);

        //constrainset image
        constraintSet.connect(corners.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0);
        constraintSet.connect(corners.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 130);
        constraintSet.connect(corners.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 1);

        //constrainset text
        constraintSet.connect(text.getId(), ConstraintSet.TOP, corners.getId(), ConstraintSet.BOTTOM, 10);
        constraintSet.connect(text.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 0);
        constraintSet.connect(text.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 100);
//        constraintSet.applyTo(cons);


        constraintSet.applyTo(cons);
    }

    }
}