import java.io.*;

class Shape {// Super class
    void input() {//Declaring a method for taking input

    }

    void cal() {//Declaring this method for calculation and display the output

    }
}//End of Shape class(Parent class)

class Rectangle extends Shape {// Sub class
    int length, breadth;

    void input() {//Here i appling the concept of "Method OverRiding"
        Console c = System.console();
        length = Integer.parseInt(c.readLine("Enter the length of the rectangle :- "));//Taking Length and breadth of a rectangle as input
        breadth = Integer.parseInt(c.readLine("Enter the breadth of the rectangle :- "));
    }

    void cal() {//Method OverRiding
        System.out.println("Area = " + (length * breadth) + " units");//Calculating the area of the rectangle
    }
}//End of Rectangle class

class Square extends Shape {// Sub class
    int side;

    void input() {//Method OverRiding
        Console c = System.console();
        side = Integer.parseInt(c.readLine("Enter the side of the Square :- "));//Taking side of the square as input
    }

    void cal() {//Method OverRiding
        System.out.println("Area = " + (side * side) + " units");//Calculating the area of square
    }
}//End of Square class

class Inheritance {//Driver class
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();//Creating object of Rectangle and Square class
        Square s1 = new Square();
        Console c = System.console();
        //Taking choice from the user 
        int choice = Integer.parseInt(c.readLine(
                "Enter '1' for calulating area of Square.\nEnter '2' for calculating area of Rectangle. \nEnter your choice :- "));
        //Displaying the output according the input
        if (choice == 1) {
            s1.input();
            s1.cal();
        } else if (choice == 2) {
            r1.input();
            r1.cal();
        } else {
            System.out.println("Invalid choice.....");
        }
    }//End of main method 
}//End of the driver class