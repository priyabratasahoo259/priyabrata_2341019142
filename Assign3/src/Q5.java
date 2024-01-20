import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		
		int a=sc.nextInt();
		if((a%4==0 && a%100!=0) || a%400==0) 
		System.out.println(a+ " is leap year : true");
		else 
			System.out.println(a+ " is leap year : false");
	}

}
