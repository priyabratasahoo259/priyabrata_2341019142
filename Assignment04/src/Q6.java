import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
        int x=sc.nextInt();
        System.out.println("Enter the power: ");
        int y=sc.nextInt();
        int power=1;
        for(int i=1; i<=y;i++) {
        	power=power*x;
        }
        System.out.println(x+" to the power "+y+" is: "+power);
	}

}
