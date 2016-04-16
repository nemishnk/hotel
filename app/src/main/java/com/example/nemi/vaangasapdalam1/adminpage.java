package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminpage extends AppCompatActivity {
    Button b1;
    int auth,x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = (Button) findViewById(R.id.bus);







            b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText t1 =(EditText)findViewById(R.id.adminuser);
                final EditText t2 =(EditText)findViewById(R.id.adminpass);
                String username1 = t1.getText().toString();
                String password1 = t2.getText().toString();
                if(username1.equals("nemish"))
                {
                    if(password1.equals("cheese"))
                    {
                        Intent go1 = new Intent(adminpage.this, adminhome.class);
                        startActivity(go1);
                    }
                }
                if(username1.equals("darshak"))
                {
                    if(password1.equals("pepper"))
                    {
                        Intent go1 = new Intent(adminpage.this, adminhome.class);
                        startActivity(go1);
                    }
                }
                if(username1.equals("balaji"))
                {
                    if(password1.equals("meals"))
                    {
                        Intent go1 = new Intent(adminpage.this, adminhome.class);
                        startActivity(go1);
                    }
                }
                if(username1.equals("anavatya"))
                {
                    if(password1.equals("coolboy"))
                    {
                        Intent go1 = new Intent(adminpage.this, adminhome.class);
                        startActivity(go1);
                    }
                }



            }

        });



    }

}
