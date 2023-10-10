import java.io.*;

class Even2 {
    int num1, num2;

    void input() {
        Console c = System.console();
        num1 = Integer.parseInt(c.readLine("Enter the initial number :- "));
        num2 = Integer.parseInt(c.readLine("Enter the final number(Greater than initial number) :- "));
    }

    void even() {//Method to find and show even number
        if (num1 > num2) {
            System.out.println("Initial value must be less than final value");
        }
        else{
            System.out.print("List of Even numbers :- ");
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }//End of the loop
        }
    }

    void odd() {//Method to find and show odd number
        System.out.print("\nList of odd numbers :- ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }//End of the loop
    }

    public static void main(String args[]) {
        Even2 e = new Even2();//Object
        //Calling methods with the help of object
        e.input();
        e.even();
        e.odd();
    }//End of main method
}//End of the class