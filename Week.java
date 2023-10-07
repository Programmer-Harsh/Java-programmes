import java.io.Console;

public class Week {
    public static void main(String args[]) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the number of days :- "));
        switch (num) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
        }
    }
}