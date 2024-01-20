import java.util.*;
public class Q01 {
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter the first number");
    	int n1=sc.nextInt();
    	
    	System.out.println("Enter the second number");
    	int n2=sc.nextInt();
    	
    	int sum1=0;
    	int sum2=0;
    	
    	for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum1 +=i; 
			}
		}
			for(int i=1;i<n2;i++)
			{
				if(n2%i==0)
				{
					sum2 +=i; 
				}
			
    }
}
    }

