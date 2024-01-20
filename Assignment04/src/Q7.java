import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		int x=sc.nextInt();
		int i=1, r=1;
		System.out.println("the multiplication table of "+x+" is: ");
		while (i<=10) {
			r=(x*i);
		System.out.println(x+"x"+i+"="+r);
		i++;
		}
	}

}
