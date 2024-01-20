package assignment5;
import java.util.Scanner;
public class A5Q9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double sum1=0;
			double c=Math.pow(i,2);
			sum1=1/c;
			sum=sum+sum1;
		}
System.out.println("the sum of the series is"+sum);
	}

}
