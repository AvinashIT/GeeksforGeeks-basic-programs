/*
  INPUT:
  Enter 3 Numbers:5 2 3
  5is the greatest
 */
package demo;
import java.util.*;
public class largest_3_numbers {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 3 Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.print(a+" is the greatest");
		else if(b>c)
		System.out.print(b+" is the greatest");
		else
		System.out.print(c+" is the greatest");
		
		
	}

}
