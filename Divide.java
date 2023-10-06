import java.io.Console;

public class Divide{
    public static void main(String args[]){//Main method
        Console c = System.console();
        //Taking two numbers from the user
        Float num1 = Float.parseFloat(c.readLine("Enter the number : "));
        Float num2 = Float.parseFloat(c.readLine("Enter the other number : "));
        //Calculating and Display the output
        System.out.println("The Division of "+ num1 + " and " + num2 + " is : "+ (num1 / num2));

    }//End of main method 
}//End of the class