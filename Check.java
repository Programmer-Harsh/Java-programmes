import java.io.Console;

class Check {
    public static void main(String args[]) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the nnumber to check : "));
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Yes,it is divisible by 5 and 7.");
        } else {
            System.out.println("Not divisible");
        }
    }
}