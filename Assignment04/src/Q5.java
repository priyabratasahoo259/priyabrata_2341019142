import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int N=sc.nextInt();
		int sum=0;
		for(int i=1;i<=N/2;i++)
		{
			if(N%i==0)
			{
				sum +=i;
			}
		}
if(sum==N)
	System.out.println(N+" is a perfect number");
else 
	System.out.println(N+" is not a perfect number");
	}

}
