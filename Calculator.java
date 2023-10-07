import java.io.Console;

class Calculator {
    static void add(float num1, float num2) {
        System.out.println("Addition :- " + (num1 + num2));
    }

    static void sub(float num1, float num2) {
        System.out.println("Subtration :- " + (num1 - num2));
    }

    static void multiply(float num1, float num2) {
        System.out.println("Multiplicatiion :- " + (num1 * num2));
    }

    static void divide(float num1, float num2) {
        System.out.println("Division :- " + (num1 / num2));
    }

    public static void main(String args[]) {
        Console c = System.console();
        float num1 = Float.parseFloat(c.readLine("Enter the number : "));
        float num2 = Float.parseFloat(c.readLine("Enter the other number : "));
        int choice = Integer
                .parseInt(c.readLine("1.Addition\n2.Subtration\n3.Multiplication\n4.Divide\nEnter your choice :- "));
        switch (choice) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                sub(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
        }

    }
}