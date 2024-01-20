package assignment5;
import java.util.Scanner;
public class A5Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the lower range: ");
		int l=s.nextInt();
		System.out.println("enter the upper range: ");
		int u=s.nextInt();
		System.out.print("list of prime no.s between "+l+" to "+u+" are: ");
		for(int n=l;n<=u;n++)
		{
			int c=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.print(n+" ");
			}
		}
		

	}

}
