/*INPUT:
 ENTER A NUMBER:5
 0 1 1 2 3 
*/
package demo;
import java.util.Scanner;
public class fibonaci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		int ite,start=0,end=1,t;
		ite=sc.nextInt();
		while(ite>0)
		{
			System.out.print(start+" ");
			t=start+end;
			start=end;
			end=t;
			ite--;
		}
		
}
}
