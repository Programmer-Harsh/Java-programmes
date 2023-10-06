import java.io.Console;
public class Modulo{
    public static void main(String args[]){
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter the number : "));
        int num2 = Integer.parseInt(c.readLine("Enter the other which is less than first number : "));
        System.out.println("Modulus : "+(num1%num2));
    }
}