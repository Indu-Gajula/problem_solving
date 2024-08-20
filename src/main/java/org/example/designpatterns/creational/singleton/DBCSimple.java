package org.example.designpatterns.creational.singleton;


// not thread safe --  won't be used in reality
public class DBCSimple {
    private static DBCSimple dbc = null;

    private DBCSimple(){}

    public static DBCSimple getInstance(){
        if(dbc == null){
            return new DBCSimple();
        }
        return dbc;
    }
}
