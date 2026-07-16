package com.spring;
// singleton
public class DBConnection {
    private String connection;
    private String username;
    private String password;

//    step1:
    //make the constructor private
    private  DBConnection(String connection, String password, String username) {
        this.connection = connection;
        this.password = password;
        this.username = username;
    }
//    step 2:
    //create a method that will return only 1 object
    private static DBConnection dbConnection;// by default the value is null

    public static DBConnection getDBConnection(){
        if(dbConnection == null){
            dbConnection = new DBConnection("MySQL","root","root");

        }
        return dbConnection;

    }
}
