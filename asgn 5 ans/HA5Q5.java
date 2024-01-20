package assignment5;
import java.util.Scanner;
public class HA5Q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
 System.out.println("enter the number of terms: ");
 int n=s.nextInt();
 int a=0,b=1;
 if(n==1)
 
	 System.out.print("series are: "+a);
 else if(n==2)
	 System.out.print("series are:"+a+","+b+"");
 else
 {
	 System.out.print("series are:"+a+","+b+""); 
 }
 int i=3;
 while(i<=n) {
	 int sum=a+b;
	 System.out.print(","+sum);
	 a=b;
	 b=sum;
	 i++;
 }
	} 

	}


