import java.io.Console;
public class Name{
    public static void main(String args[]) {
        Console c = System.console();
        String s1 = c.readLine("Enter your first name : ");
        String s2 = c.readLine("Enter your middle name : ");
        String s3 = c.readLine("Enter your last name : ");
        System.out.println("Your full name is : " + s1 + " " + s2 + " " + s3);
    }
}
