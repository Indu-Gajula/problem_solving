package org.example.designpatterns.creational.singleton;

// supports multi threading but very slow
public class DBCSynchronized {
    private static DBCSynchronized dbc = null;

    private DBCSynchronized(){

    }
    public static synchronized DBCSynchronized getInstance(){
        if(dbc == null){
            dbc  = new DBCSynchronized();
        }
        return dbc;

    }

}
