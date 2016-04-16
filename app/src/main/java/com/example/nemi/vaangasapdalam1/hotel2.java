package com.example.nemi.vaangasapdalam1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class hotel2 extends AppCompatActivity {
    ViewPager viewPager;
    customswipeadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager= (ViewPager) findViewById(R.id.view_pager);
        adapter=new customswipeadapter(this);
        viewPager.setAdapter(adapter);


    }

}
