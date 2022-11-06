package demo;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		int no,fac=1;
		no=sc.nextInt();
		while(no>0)
		{
			fac*=no;
			no--;
		}
		System.out.print("FACTORAIL: "+ fac);
	}
}
