import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x: ");
		int x=sc.nextInt();
		System.out.println("enter the value of y: ");
		int y=sc.nextInt();
		while (x%y!=0) {
			int subh=x%y;
			x=y;
			y=subh;
		}
System.out.println("GCD is:"+y);
	}

}
