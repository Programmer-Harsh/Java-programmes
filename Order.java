import java.io.Console;
public class Order
{
    public static void main(String args[])
    {
        Console c=System.console();
        String s1= c.readLine("Order ID : ");
        String s2 = c.readLine("Product name : ");
        String s3=c.readLine("Quantity : ");
        System.out.println("\t<---- The Entered order is ----> ");
        System.out.println("Order ID : "+s1+"\nProduct name : "+s2+"\nQuantity : " +s3);
    }
}