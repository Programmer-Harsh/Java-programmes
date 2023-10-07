import java.io.Console;

public class Even {
    public static void main(String args[]) {
        Console c = System.console();
        String s = c.readLine("Enter the number : ");
        int num = Integer.parseInt(s);
        if (num % 2 == 0) {
            System.out.println(num + " is even number....");
        } else {
            System.out.println(num + " is odd number.....");
        }

    }
}