//import java.io.Console;
public class Concatenate{
    public static void main(String args[]){
        Console c = System.console();
        String s1 = c.readLine("Enter the number : ");
        String s2 = c.readLine("Enter the other number : ");
        System.out.println(s1 + s2);
    }
}
