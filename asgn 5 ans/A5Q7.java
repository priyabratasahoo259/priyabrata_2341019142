package assignment5;
import java.util.Scanner;
public class A5Q7 {

	public static void main(String[] args) {
	
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of rows you want: ");
	int r=s.nextInt();
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(64+j));
		}
		System.out.println();
	}

		}




		


	}


