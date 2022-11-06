/*ENETER THE RANGE:1 20
 PRIME NUMBERS:2 3 5 7 11 13 17 19*/
package demo;
import java.util.*;
public class prime_nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end,f=0;
		System.out.print("ENETER THE RANGE:");
		start=sc.nextInt();
		end=sc.nextInt();
		System.out.print("PRIME NUMBERS:");
		for(int i=start;i<=end;i++)
		{
			f=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				 f=1;
				break;
				}
			}
			if(f==0 && i!=1)
				System.out.print(i+" ");
		}

	}

}
