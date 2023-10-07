import java.io.Console;
public class Reverse{
    public static void main(String args[]){
        Console c = System.console();
        int rem=0;
        int num=Integer.parseInt(c.readLine("Enter the your number :- "));
        while(num!=0){
            rem=num%10;
            num = num/10;
            System.out.print(rem);
        }
    }
}