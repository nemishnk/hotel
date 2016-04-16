package com.example.nemi.vaangasapdalam1;

import java.util.List;
import java.util.ArrayList;

public class restrauntdata {
    List<String> exp;

    public restrauntdata()
    {
        exp=new ArrayList<String>();
    }

    public ArrayList<String> billarray()

    {
        return (ArrayList<String>)exp;
    }
    public void cancel()
    {
        exp.clear();
    }

    public void insertarray( String st, String s)
    {

        exp.add(st);
        exp.add(s);
    }
}
