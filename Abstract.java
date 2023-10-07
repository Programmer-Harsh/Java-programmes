/* When a class declared as abstract then it is called abstract class(and it's not important to declare their method as abstract)
and we can't able to create object of that class directly
when a method declared as abstract then their class also must be declared as abstract */

import java.io.*;

abstract class Vehicle {// Super class
    // Declaring methods without their bodies
    abstract void brand();

    abstract void model();

    abstract void year();

    abstract void show();
}//End of Super class(Vehicle)

class Car extends Vehicle {// Sub class
    Console c = System.console();
    String b, m, y;
    //Declaring the bodies and writing some code 
    void brand() {
        b = c.readLine("Enter the brand of the car :- ");
    }

    void model() {
        m = c.readLine("Enter model name of the car :- ");
    }

    void year() {
        y = c.readLine("Enter the purchased year of the car :- ");
    }

    void show() {
        System.out.println("Brand : " + b);
        System.out.println("Model : " + m);
        System.out.println("Year : " + y);
    }
}//End of Sub class(Car) 

class Abstract {//Driver class
    public static void main(String args[]) {//Main method
        Car c1 = new Car();
        c1.brand();
        c1.model();
        c1.year();
        c1.show();
    }//End of main method
}//End of Driver class(Abstract)