/*Java Program to Multiply Two Floating-Point Numbers
INPUT:
6
1
OUTPUT:
even:6
odd:1
*/
import java.util.*;
public class Main
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a%2==0)
        System.out.println("even:"+a);
        if(b%2==0)
        System.out.println("even:"+b);
        if(a%2!=0)
        System.out.println("odd:"+a);
        if(b%2!=0)
        System.out.println("odd:"+b);
    }
}
