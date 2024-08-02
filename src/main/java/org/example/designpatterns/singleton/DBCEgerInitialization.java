package org.example.designpatterns.singleton;

// threadsafe - > pure singlton
//but, early loading
public class DBCEgerInitialization {

    private static DBCEgerInitialization dbc = new DBCEgerInitialization();
    private DBCEgerInitialization(){

    }

    public static DBCEgerInitialization getInstance(){
        return dbc;
    }
}
