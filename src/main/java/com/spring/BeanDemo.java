package com.spring;
//initializing property value via setter method
// initializing the data member/property values via constructor
public class BeanDemo {
    private int id;
    private String name;

    //constructor
    public BeanDemo(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void add(int a , int b){
        System.out.println("addition: "+ (a+b));
    }
}
