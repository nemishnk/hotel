package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class restraunt1 extends AppCompatActivity {
    Button b;
    private static ListView list_view;
    private static String[] NAMES=new String[] {"ITEMS " +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tID ",
            "Cereal and milk" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 501",
            "Bread and Butter " +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t502",
            "Omlette " +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 503",
            "Dosa with sambhar  " +
                    "\t\t\t\t\t\t\t\t\t 504"};
    public void listview() {
        list_view = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.orderlist, NAMES);
        list_view.setAdapter(adapter);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listview();

        b=(Button)findViewById(R.id.org);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(restraunt1.this, restraunt2.class);
                startActivity(go);
            }
        });





    }

}
