import java.util.Scanner ;
public class icp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter secomd number");
		int b=sc.nextInt();
		System.out.println("GCD of  "+ a + " and " +b+" is ");
		while(a%b!=0)
			//equals      to zero
		{
			i=a%b;
			a=b;
			b=i;
		}
		System.out.println(b+ ".");
	}

}
