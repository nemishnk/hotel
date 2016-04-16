package com.example.nemi.vaangasapdalam1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class restraunt2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    restrauntdata data1 ;
    Double itemTotalCost;
    List<String> exp,exp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        data1 = new restrauntdata();
        exp=new ArrayList<String>();
        final EditText ic =(EditText)findViewById(R.id.itemcode);
        final EditText iq =(EditText)findViewById(R.id.itemquantity);
        // tofind which item correponds to which cod
        b1=(Button)findViewById(R.id.addbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemcode = ic.getText().toString();
                int itemquantity = Integer.parseInt(iq.getText().toString());
                if(itemcode.equals("501"))
                {

                    itemTotalCost= Double.valueOf(itemquantity*40);
                    data1.insertarray("Cereal and Milk", itemTotalCost.toString());
                    Toast pass = Toast.makeText(restraunt2.this,"Cereal and milk added",Toast.LENGTH_SHORT);
                    pass.show();
                }

                else if(itemcode.equals("502"))
                {
                    itemTotalCost=Double.valueOf(itemquantity*30);
                    data1.insertarray("Bread and Butter", itemTotalCost.toString());
                    Toast pass = Toast.makeText(restraunt2.this,"Bread and butter",Toast.LENGTH_SHORT);
                    pass.show();
                }
                else if(itemcode.equals("503"))
                {
                    itemTotalCost=Double.valueOf(itemquantity*15);
                    data1.insertarray("Omlette", itemTotalCost.toString());
                    Toast pass = Toast.makeText(restraunt2.this,"Omlette",Toast.LENGTH_SHORT);
                    pass.show();
                }
                else if(itemcode.equals("504"))
                {
                    itemTotalCost=Double.valueOf(itemquantity*60);
                    data1.insertarray("Dosa with sambhar", itemTotalCost.toString());
                    Toast pass = Toast.makeText(restraunt2.this,"Dosa with sambhar",Toast.LENGTH_SHORT);
                    pass.show();
                }
                else
                {
                    Toast pass = Toast.makeText(restraunt2.this,"Invalid code ,Refer the list",Toast.LENGTH_SHORT);
                    pass.show();
                }
            }
        });
        //go back too see the code
        b2=(Button)findViewById(R.id.menubutton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(restraunt2.this, restraunt1.class);
                startActivity(go);

            }
        });
        b3=(Button)findViewById(R.id.incbutton);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int itemquantity = Integer.parseInt(iq.getText().toString());
                itemquantity = itemquantity+1;
                iq.setText(Integer.toString(itemquantity));
            }
        });

        b4=(Button)findViewById(R.id.decbutton);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemquantity = Integer.parseInt(iq.getText().toString());
                itemquantity = itemquantity - 1;
                iq.setText(Integer.toString(itemquantity));
            }
        });

        b5=(Button)findViewById(R.id.org);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent go = new Intent(restraunt2.this, restraunt3.class);
                startActivity(go);
            }
        });


    }

}
