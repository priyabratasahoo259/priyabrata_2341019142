package assignment5;
import java.util.Scanner;
public class A5Q8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n: ");
int n=s.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
	int sum1=0;
	for(int j=1;j<=i;j++)
	{
		sum1=sum1+j;
	}
	sum=sum+sum1;
}
System.out.println("sum is "+sum);
	}

}
