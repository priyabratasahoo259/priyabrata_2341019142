import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        System.out.println("enter value of N:  ");
        int n=ip.nextInt();
        int i;
        int sum=0;
        System.out.println("computer give random no : ");
        for(i=1; i<=n;i++) {
        	double rand=Math.random();
        sum+=rand;
        System.out.println(i +"=" +rand);
        }

	}

}
