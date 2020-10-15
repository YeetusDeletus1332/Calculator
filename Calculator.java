import java.util.Scanner;
import java.lang.Math;

public class Input {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        int a = input.nextInt();
        System.out.println("Enter your seccond number");
        int b = input.nextInt();
        System.out.println("Calculating, Please wait...");
        int p = a + b;
        int s = a - b;
        int m = a * b;
        int d = a / b;
        
        System.out.println(a + " Plus: " + b + " Equals: " + p);
        System.out.println(a + " Minus: " + b + " Equals: " + s);
        System.out.println(a + " Multiplied By: " + b + " Equals: " + m);
        System.out.println(a + " Divided By: " + b + " Equals: " + d);
        double result = Math.pow(a, b);

        System.out.println(a + " To The Power Of: " + b + " Equals: " + result);
        System.out.println("Square Root of: " + a + " Equals: " + Math.sqrt(a));
        System.out.println("Square Root of: " + b + " Equals: " + Math.sqrt(b));
        
        input.close();
        
    
 }
}