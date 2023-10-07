import java.io.Console;
class Year{
    public static void main(String args[]){
        Console c = System.console();
        int month=Integer.parseInt(c.readLine("Enter the month number :- "));
        int year=Integer.parseInt(c.readLine("Enter the year :- "));
        switch(month){
            case 1:System.out.println("Month :- January\nNumber of days :- 31");
            break;
            case 2:System.out.println("Month :- February");
            if(year%400==0 || year%100!=0 && year%4==0){
                System.out.println("Number of days :- 28   and\nIt's a Leap year ");
            }
            else{
                System.out.println("Number of days :- 29");
            }
            break;
            case 3:System.out.println("Month :- March\nNumber of days :- 31");
            break;
            case 4:System.out.println("Month :- April\nNumber of days :- 30");
            break;
            case 5:System.out.println("Month :- May\nNumber of days :- 31");
            break;
            case 6:System.out.println("Month :- June\nNumber of days :- 30");
            break;
            case 7:System.out.println("Month :- July\nNumber of days :- 31");
            break;
            case 8:System.out.println("Month :- August\nNumber of days :- 31");
            break;
            case 9:System.out.println("Month :- September\nNumber of days :- 30");
            break;
            case 10:System.out.println("Month :- October\nNumber of days :- 31");
            break;
            case 11:System.out.println("Month :- November\nNumber of days :- 30");
            break;
            case 12:System.out.println("Month :- December\nNumber of days :- 31");
            break;
        }
    }
}