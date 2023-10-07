import java.io.Console;
public class Book
{
    public static void main(String args[])
    {
        Console c=System.console();
        String s1= c.readLine("Book name : ");
        String s2 = c.readLine("Publisher name : ");
        String s3=c.readLine("Author name : ");
        System.out.println("\t<---- The Entered input is ----> ");
        System.out.println("Book name : "+s1+"\nPublisher name : "+s2+"\n Author name : " +s3);
    }
}