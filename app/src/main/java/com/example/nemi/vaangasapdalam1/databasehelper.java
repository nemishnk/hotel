package com.example.nemi.vaangasapdalam1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by NeMi on 05-04-2016.
 */
public class databasehelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME ="contact.db";
    private static final String TABLE_NAME ="contacts";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_MOBILE="mobile";
    private static final String COLUMN_EMAIL="email";
    private static final String COLUMN_USERNAME="username";
    private static final String COLUMN_PASSWORD="password";
    private static final String COLUMN_LEVEL="level";
    SQLiteDatabase db;

    private static final String CREATE_TABLE="create table contacts (id integer  primary key, name text not null,"+
    "email text not null,mobile text not null,username text not null unique,password text not null  );";
    //private static final String ADMIN_ROW="insert into contacts (id,name,mobile,email,username,password,level) values ('admin',0000000000,'admin@admin.com','admin','admin',1)" ;
    //private static final String droptable="drop table contacts";
    public databasehelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);
        this.db=db;

    }
    public void insertcontact(contact c)
    {
        db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        String query1 = "select * from contacts";
        Cursor cursor= db.rawQuery(query1,null);
        int count =cursor.getCount();
        values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME,c.getName());
        values.put(COLUMN_EMAIL,c.getEmail());
        values.put(COLUMN_MOBILE,c.getMobile());
        values.put(COLUMN_USERNAME,c.getUsername());
        values.put(COLUMN_PASSWORD, c.getPassword());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query="DROP TABLE IF EXISTS"+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }

    public  String search(String usernamestr)
    {
        db=this.getReadableDatabase();
        String q="select * from  " +TABLE_NAME;
        Cursor cursor =db.rawQuery(q,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst())
        {
            do{
                a=cursor.getString(4);
                if(a.equals(usernamestr))
                {
                    b=cursor.getString(5);
                    break;
                }
            }while(cursor.moveToNext());
        }
        cursor.close();
        return b;
    }
}
