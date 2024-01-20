import java.util.*;
public class DivisibleByNine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num, sum=0;
		while(num>0);
		{
			int rem=num%10;
			num=num/10;
			sum+=rem;
		}
		if(sum%9==0)
		{
			System.out.println("yes! the number "+num+" divibible by nine");
		}
		else 
		{
			System.out.println("no! the number "+num+" not divibible by nine");
		}
		
		}
	
	}


