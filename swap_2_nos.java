
/*
Java Program to Swap Two Numbers
INPUT:
23 45 
OUTPUT:
before swapping
value of a:23
value of b:45
after swapping
value of a:45
value of b:23
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,t;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
	
	}
}

