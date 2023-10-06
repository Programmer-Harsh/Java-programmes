import java.io.Console;
public class Sub{
    public static void main(String arrgs[]){
    Console c = System.console();
    String s1 = c.readLine("Enter the number : ");
    String s2 = c.readLine("enter the other number : ");
    int num1 = Integer.parseInt(s1);
    int num2 = Integer.parseInt(s2);
    System.out.println("After subtraction the answer is : "+(num1 - num2 ));
    }
}