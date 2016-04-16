package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signupactivity extends AppCompatActivity {
    Button b1;
    databasehelper helper=new databasehelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText name =(EditText)findViewById(R.id.name);
        final EditText email =(EditText)findViewById(R.id.email);
        final EditText mobile =(EditText)findViewById(R.id.mobile);
        final EditText username =(EditText)findViewById(R.id.username);
        final EditText password =(EditText)findViewById(R.id.password);



        b1=(Button)findViewById(R.id.signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String namestr = name.getText().toString();
                String emailstr = email.getText().toString();
                String mobilestr = mobile.getText().toString();
                String usernamestr = username.getText().toString();
                String passwordstr = password.getText().toString();

                contact c =new contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setMobile(mobilestr);
                c.setUsername(usernamestr);
                c.setPassword(passwordstr);

                helper.insertcontact(c);

                Toast pass = Toast.makeText(signupactivity.this,"Sign up succesfull",Toast.LENGTH_SHORT);
                pass.show();


            }
        });



    }

}
