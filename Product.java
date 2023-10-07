import java.io.Console;
public class Product
{
    public static void main(String args[])
    {
        Console c=System.console();
        String s1= c.readLine("Product name : ");
        String s2 = c.readLine("Manufacturer name : ");
        String s3=c.readLine("Price : ");
        System.out.println("\t<---- The Entered input is ----> ");
        System.out.println("Product name : "+s1+"\nManufacturer name : "+s2+"\n Price : " +s3);
    }
}