package assignment5;
import java.util.Scanner;
public class A5Q10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=s.nextInt();
		int a=0,b=1,c=1;
		System.out.print("sequence is "+a+" "+b+" "+c);
		for(int i=4;i<=n;i++)
		{
			int sum=a+b+c;
			System.out.print(" "+sum);
			a=b;
			b=c;
			c=sum;
		}
		

	}

}
