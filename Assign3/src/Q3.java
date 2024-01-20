import java.util.*;
public class Q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int a=sc.nextInt();
    
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	
	System.out.println("Enter the third number");
	int c=sc.nextInt();
	
	if(a>b && a>c && b>c) 
		System.out.println("Decresing");
		
		else if(b>a && b>c && c>a)
		System.out.println("increasing");
		
	
	}

}
