package assignment5;
import java.util.Scanner;
public class A5Q4 {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter the  lower value : ");
 int m=s.nextInt();
 System.out.println("enter the upper value : ");
 int n=s.nextInt();

 for(int i=m;i<=n;i++)
 {
	 int factorial=1;
	 for(int j=i;j>=1;j--)
	 {
		
		  factorial*=j;
	 }
	 System.out.println("the facotial of "+i+" is "+factorial+"");
 }
 

	}

}
