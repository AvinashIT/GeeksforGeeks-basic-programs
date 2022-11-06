/*
 INPUT:
 ENETER 2 NUMBERS:2 4
 LCM:4
 */
package demo;
import java.util.*;
import java.math.*;
public class lcm_2_numbers {
//FORMULA a*b=lcm(a,b)*gcd(a,b)----->lcm=(a*b)/gcd(a,b)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fno,sno;
		int nor_gcd,lcm;
		System.out.print("ENETR 2 NUMBERS:");
		
		fno=sc.next();
		sno=sc.next();
		BigInteger bg1=new BigInteger(fno);
		BigInteger bg2=new BigInteger(sno);
		nor_gcd=bg1.gcd(bg2).intValue();
		lcm=(Integer.parseInt(fno) * Integer.parseInt(sno)) / nor_gcd;
		System.out.print("LCM:"+lcm);
		
		
	}

}
