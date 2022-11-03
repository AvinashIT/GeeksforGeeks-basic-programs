/*Java Program to Multiply Two Floating-Point Numbers and formatting
INPUT:
2.3 4.5
OUTPUT:
your product is 10.35
*/
import java.util.*;
public class Main
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.printf("your product is %.2f",a*b);
    }
}
