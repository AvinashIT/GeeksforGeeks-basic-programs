/*
 INPUT:1
 2
 2-9i
 5+8i
 SUM:7-1i
 INPUT:2
 3
 2-88i
 5+9i
 6-7i
 SUM:14-158i
 */
package demo;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j,i,k,num,dum=0,dum2=0,realsum=0,imgsum=0;
		num=sc.nextInt();
		int real[]=new int[99];
		int img[]=new int[99];
		String realno="",imgno="";
		for(i=0;i<=num;i++)
		{
			String h=sc.nextLine();
			char comp[]=h.toCharArray();
			for(j=0;j<comp.length;j++)
			{
				if(j!=0 && (comp[j]=='+'||comp[j]=='-'))
				{
					real[dum]=Integer.parseInt(realno);
					dum++;
					realno="";
					break;
				}
				else
					realno+=Character.toString(comp[j]);
				for(k=comp.length-1;k>=0;k--)
				{
					StringBuilder bc=new StringBuilder(imgno);
					imgno=bc.reverse().toString();
					if(comp[k]=='i')
						continue;
					else if((comp[k]=='+'||comp[k]=='-')&&(comp[k-1]!='+'||comp[k-1]!='-'))
					{
						if(comp[k]=='-')
						{
							img[dum2]=(-1)*Integer.parseInt(imgno);
							imgno="";
						}
						else
							img[dum2]=Integer.parseInt(imgno);
						imgno="";
						dum2++;
						break;
						
					}
					else
						imgno+=Character.toString(comp[k]);
			}
			
		}
		
	}
		for(i=0;i<dum;i++)
			realsum+=real[i];
		for(i=0;i<dum;i++)
			imgsum+=img[i];
		System.out.print("SUM:"+""+realsum+""+imgsum+"i");
		
	}
}

