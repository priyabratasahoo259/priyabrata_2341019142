import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int u,c;
		do
		{
			System.out.println("Enter user guess");
			u=sc.nextInt();
			c=(int)(1+10*Math.random());
			System.out.println("user guess="+c);
			System.out.println("computer guess="+c);
			
			if(u==c)
				System.out.println("guess is corect");
			
			else if (u>c)
			System.out.println("too high,try again");
			else
				System.out.println("too low, try again");
		}
		while(u!=c);
	}

}
