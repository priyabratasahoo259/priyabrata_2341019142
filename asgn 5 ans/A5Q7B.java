package assignment5;
import java.util.Scanner;
public class A5Q7B {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of rows you want: ");
	int r=s.nextInt();
	for(int i=r;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("$");
		}
		System.out.println();
	}

		}




		


	}


