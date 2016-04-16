package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class restraunt3 extends AppCompatActivity {
    Button b1,b2;
    restrauntdata data;
    List<String> exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        data = new restrauntdata();
        exp=new ArrayList<String>();
        final TextView myText = (TextView) findViewById(R.id.ordertext);
        b1=(Button)findViewById(R.id.bill);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp = data.billarray();
                Iterator<String> itr = exp.iterator();
                while (itr.hasNext()) {

                    myText.setText(itr.next() + "\t\t");
                }
            }
        });
        b2=(Button)findViewById(R.id.cancelbutton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.cancel();
            }

        });


    }

}
