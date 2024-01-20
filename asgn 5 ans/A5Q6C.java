package assignment5;
import java.util.Scanner;
public class A5Q6C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of rows you want: ");
int r=s.nextInt();
int k=1;
for(int i=0;i<=r;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(k+" ");
		k++;
	}
	System.out.println();
}

	}




	}

