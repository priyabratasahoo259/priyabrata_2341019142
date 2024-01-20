import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer N");
		int N= sc.nextInt();
		int max  =N , min=1;
		int i=1;
		int sum =0;
		System.out.println("Random number generated are : ");
		do {
			int no=(int)(Math.random()*(max-min+1))+min;
			sum +=no;
			i++;
		
		}while(i<=N);
		double avg = (double)sum/N;
		System.out.println("\nAverage of "+N+" random numbers are "+avg);
	}

}
