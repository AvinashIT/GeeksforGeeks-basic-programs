/*
 *INPUT:
 ENTER A NUMBER:9
 NEON NUMBER
 */
package demo;
import java.util.*;
public class neon_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,sqr,sum=0,t;
		System.out.print("ENTER A NUMBER:");
		a=sc.nextInt();
		sqr=a*a;
		t=sqr;
		while(t>0)
		{
			
			sum+=t%10;
			t/=10;
		}
		if(sum==a)
			System.out.print("NEON NUMBER");
		else
			System.out.print("NOT A NEON NUMBER");

	}

}
