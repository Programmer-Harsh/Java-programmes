import java.io.Console;
public class Add{
    public static void main(String args[]){
        Console c = System.console();
        String s1 = c.readLine("Enter the number : ");
        String s2 = c.readLine("Enter the other number : ");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        System.out.println("The addition of "+ num1 + " and " + num2 + " is : "+ (num1 + num2));
    }
}