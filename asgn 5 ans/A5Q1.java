package assignment5;
import java.util.Scanner;
public class A5Q1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int a1=a,b1=b;
		int sum1=0,sum2=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				sum1+=i;
			}
			}
		System.out.println("the sum of the divisors of "+a1+" is "+sum1+"");
			for(int j=1;j<=b/2;j++)
			{
				if(b%j==0)
				{
					sum2+=j;
					
				}
			}
			System.out.println("the sum of the divisors of "+b1+" is "+sum2+"");
				if(sum1==b && sum2==a) {
					System.out.println("yes! it is amicable number");
				}
				else
				{
					System.out.println("no! it is not amicable number");
				}
			}
		}

	


