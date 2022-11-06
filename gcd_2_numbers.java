package demo;
/*INPUT:
 ENTER 2 NOS:10 8
 GCD:2
 */
import java.util.*;

public class gcd_2_numbers {
	 public static int  gcd(int a,int b)
	 {
	 	if(a==0)
	 		return 0;
	 	if(b==0)
	 		return 0;
	 	if(a==b)
	 		return a;
	 	if(a>b)
	 		return gcd(a-b,b);
	 	return gcd(a,b-a);
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fno,sno;
		System.out.print("ENTER 2 NUMBERS:");
		fno=sc.nextInt();
		sno=sc.nextInt();
		System.out.print("GCD:"+gcd(fno,sno));
		
	}

}
