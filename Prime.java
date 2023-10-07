import java.io.Console;
public class Prime{
    public static void main(String args[]){
        Console c = System.console();
        String s = c.readLine("Enter the number to check : ");
        int num= Integer.parseInt(s);
        int flag=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                flag++;
            }
        }
        if(flag==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite number");
        }

    }
}
