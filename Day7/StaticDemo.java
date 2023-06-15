package com.basicjava;

class Mobile{
    String brand;
    int price;
    // static variable below. can be accessed with class name also. doesn't reside in heap as other variables.
    static String category = "Electronics";

    // static block. will run only once irrespective of how many objects are created.
    static {
        category = "Default";
        System.out.println("In static block. category set to Default. will load before constructors.");
    }

    // constructor
    public Mobile(){
        brand = "Default";
        price=0;
        System.out.println("Inside constructor. loads after static block.");
    }



    public void info(){
        System.out.println("brand: "+ brand + " | price: "+ price+ " | category: "+ category);
    }
}

public class StaticDemo {

    public static void main(String args[]) {

        // Class.forName("Mobile");    // loads class even if no object created (will run static block).

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 2000;
        m1.info();

        Mobile m2 = new Mobile();
        Mobile.category = "Phones";  // accessed with class name
        m2.info();

        m1.info();  // m1 category also changed because category is static/class variable

    }
}
