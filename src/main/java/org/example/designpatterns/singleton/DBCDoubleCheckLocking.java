package org.example.designpatterns.singleton;

// best way to create a singleton object
// supports multi threading
public class DBCDoubleCheckLocking {
    private static  DBCDoubleCheckLocking dbc = null;
    private DBCDoubleCheckLocking(){}

    public static DBCDoubleCheckLocking getInstance(){
        if(dbc == null){
            synchronized (DBCDoubleCheckLocking.class){
                if(dbc == null){
                    dbc = new DBCDoubleCheckLocking();
                }
            }
        }
        return dbc;
    }

}
