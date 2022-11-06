
/*
 INPUT:
 Enter Length and Width:2 4
 PERIMETER:12
 */package demo;
import java.util.Scanner;
public class perimeter_of_a_rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length and Width:");
		int len,wid;
		len=sc.nextInt();
		wid=sc.nextInt();
		System.out.print("PERIMETER:"+(2*(len+wid)));
		

	}
}
