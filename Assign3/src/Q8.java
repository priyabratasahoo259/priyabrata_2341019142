import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,y;
		System.out.println("Enter the x and y coordinate: ");
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x>0 && y>0) {
			System.out.println("("+x+", "+y+") is on the first Quad");
		}
		else if(x<0 && y>0) {
			System.out.println("("+x+", "+y+") is on the second Quad");
		}
		else if(x<0 && y<0) {
			System.out.println("("+x+", "+y+") is on the third Quad");
		}
		else 
			System.out.println("("+x+", "+y+") is on the fourth Quad");
		
	}

}
