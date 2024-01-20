import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		int x; double p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the electricity units=");
		x=sc.nextInt();
		if(x<=50)p=x*3;
		else if (x<=200) p=50*3+(x-50)*4.80;
		else p=50*3+150*4.80+(x-200)*5.80;
		else p=50*3+150
	}

}
