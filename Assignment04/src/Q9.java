import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,newNum,i;
		System.out.println("enter a number");
		n=sc.nextInt();
		newNum=0;
		i=0;
		while(n>0) {
			int r=n%10;
			if (r!=0) {
				newNum=newNum+r*(int)Math.pow(10, i);
				i++;
			}
			n=n/10;
		}
			System.out.println("after removing 0 from the number " + newNum);
	}

}
