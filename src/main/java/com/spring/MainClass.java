package com.spring;

public class MainClass {
    public static void main(String[] args){
    DBConnection db1 = DBConnection.getDBConnection();
    DBConnection db2 = DBConnection.getDBConnection();
   //only one object created
    System.out.println(db1);
    System.out.println(db2);






    }
}
