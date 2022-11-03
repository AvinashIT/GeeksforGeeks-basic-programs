/*Java Program to Add 2 binary nos
INPUT:
101
110
OUTPUT:
Decimal Addition value:11
Binary Addition value:1011
*/
import java.util.*;
public class Main
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        a=sc.nextLine();
        b=sc.nextLine();
        int s1,s2;
        s1=Integer.parseInt(a,2);
        s2=Integer.parseInt(b,2);
        System.out.println("Decimal Addition value:"+(s1+s2));
        System.out.print("Binary Addition value:"+(Integer.toBinaryString(s1+s2)));
        
    }
}
