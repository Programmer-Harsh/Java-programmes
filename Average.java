import java.io.*;

class Average {
    Console c = System.console();
    //Firstly we take number of elements from the user
    int num = Integer.parseInt(c.readLine("Enter the number elements :- "));
    //After that we declare array and some variables
    float arr[] = new float[num];
    float avg, total;

    void input() {//Method to take input from the user
        System.out.println("<----- Enter the elements one by one -----> ");
        for (int i = 0; i < num; i++) {
            arr[i] = Float.parseFloat(c.readLine("Element [" + (i + 1) + "] -> "));
        }
    }

    float total() {//Method to calculate the sum
        for (int i = 0; i < num; i++) {
            total = total + arr[i];
        }
        return (total);
    }

    float average() {//Method to calculate average
        avg = total / num;
        return (avg);
    }

    void show() {//Method to display the output
        System.out.println("\nSum of the elements is : " + total);
        System.out.println("Average is :" + avg);
    }

    public static void main(String args[]) {//Main method 
        Average ob = new Average();//Creating the object of the class
        //Calling methods with the help of object
        ob.input();
        ob.total();
        ob.average();
        ob.show();
    }//End of main method
}//End of the class
