package com.app.robinasistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ChooseUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        TableLayout clients = (TableLayout) findViewById(R.id.users);

        //create tabel row
        TableRow row = new TableRow(this);

        //create constraint layout and constrain set
        ConstraintLayout cons = new ConstraintLayout(this);
        ConstraintSet constraintSet = new ConstraintSet();


        //create card view
        CardView corners = new CardView(this);
        corners.setLayoutParams(new FrameLayout.LayoutParams(
                CardView.LayoutParams.WRAP_CONTENT,
                CardView.LayoutParams.WRAP_CONTENT
                ));
        corners.setRadius(360);


        //create imageview and set image
        ImageView picture = new ImageView(this);
        picture.setImageDrawable(getResources().getDrawable(R.drawable.mike_andrei_433));

        //create and set text
        TextView text = new TextView(this);
        text.setText("name");



        //set constraints
        constraintSet.connect(picture.getId(),constraintSet.TOP,text.getId(),constraintSet.BOTTOM,10);




        //addimage to card
        corners.addView(picture);



        //add corners to constraint layout
        cons.addView(corners);
        cons.addView(text);


        //add picture and text to row
        row.addView(cons);



        //add  row to table
        clients.addView(row);
    }
}