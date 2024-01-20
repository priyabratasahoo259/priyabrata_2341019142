package assignment5;

import java.util.Scanner;

public class A5Q7C {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of rows you want: ");
	int r=s.nextInt();
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=r-i;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		
	}
		System.out.println();

		}




		}


	}


