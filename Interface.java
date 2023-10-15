import java.io.*;

interface Shape {// Interface
    Console c = System.console();

    void accept();// Method For taking input from user

    void area();// Method for calculating and display the output
}

class Square implements Shape {// Class which implements the interface
    int side;

    public void accept() {// Declaring Method's body
        side = Integer.parseInt(c.readLine("Enter side of the square :- "));
    }

    public void area() {// Declaring Method's body
        System.out.println("Area = " + (side * side) + "units");
    }
}

class Rectangle implements Shape {

    int l, b;

    public void accept() {// Declaring Method's body
        l = Integer.parseInt(c.readLine("Enter length of the rectangle :- "));
        b = Integer.parseInt(c.readLine("Enter breadth of the rectangle :- "));
    }

    public void area() {// Declaring Method's body
        System.out.println("Area = " + (l * b) + "units");
    }
}

class Interface {// Driver class
    public static void main(String args[]) {// Main method
        Console c = System.console();
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        int choice;
        choice = Integer.parseInt(c.readLine(
                "Enter '1' for calculating area of Square\nEnter '2' for calculating area of Rectangle\nEnter your choice :- "));
        if (choice == 1) {
            s1.accept();
            s1.area();
        } else if (choice == 2) {
            r1.accept();
            r1.area();
        } else {
            System.out.println("Invalid choice....");
        }
    }// End of main method

}// End of Driver class