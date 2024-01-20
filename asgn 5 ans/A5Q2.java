package assignment5;
import java.util.Scanner;
public class A5Q2 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a number: ");
int n=s.nextInt();
int c1=0,c2=0,rev=0;
for( int i=2;i<=n/2;i++)

	if (n%i==0) {
		c1=1;
		break;
	}

for( int i=n;i!=0;i=i/10) 
rev=rev*10+i%10;
for( int i=2;i<=n/2;i++)

	if (n%i==0) {
		c2=1;
		break;
	}
	if(c1==0&&c2==0) {
		System.out.println(+n+ " is twisted prime");
	}
else
{
	System.out.println(+n+ " is not twisted prime");
}

	}
}




