package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.nemi.vaangasapdalam1.databasehelper.*;

public class loginactivity extends AppCompatActivity {
    Button b1;
    databasehelper helper =new databasehelper(this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText username =(EditText)findViewById(R.id.editText);
        final EditText password =(EditText)findViewById(R.id.editText2);

        b1=(Button)findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String usernamestr = username.getText().toString();
                String passwordstr = password.getText().toString();

                String b = helper.search(usernamestr);
                if(b.equals(passwordstr))
                {
                    Intent go1 = new Intent(loginactivity.this,homescreen.class);
                    startActivity(go1);
                }
                else
                {
                    Toast pass = Toast.makeText(loginactivity.this,"Wrong password",Toast.LENGTH_SHORT);
                    pass.show();
                }

            }
        });


    }

}
