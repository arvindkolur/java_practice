import java.io.ObjectInputStream;
import java.util.Scanner;

class Squareofno{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        int a;
        System.out.println("enter the number");
        n=scanner.nextInt();
        a=n*n;
        System.out.println(a);
        
    }
}