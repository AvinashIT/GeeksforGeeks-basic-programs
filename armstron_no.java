/*
 INPUT:
 ENTER A NUMBER:407
 OUTPUT
 Yes
 */
package demo;
import java.util.Scanner;
public class armstron_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		int no,t,sum=0;
		no=sc.nextInt();
		t=no;
		while(t>0)
		{
			int r=t%10;
			sum+=(r*r*r);
			t/=10;
		}
		if(sum==no)
		System.out.print("Yes");
		else
		System.out.print("no");
		
	}

}
