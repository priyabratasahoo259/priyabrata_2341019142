import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("user guess the number");
		int num1=sc.nextInt();
		
		System.out.println("Computer guess the number");
		int num2=(int)(Math.random()*9+1);
		
		if(num1==num2)
			System.out.println("you got it right");
		
		else if(num1==(num2-1)||num1==(num2+1))
		System.out.println("you got it right");
		else 
			System.out.println("you got it wrong");
	}

}
