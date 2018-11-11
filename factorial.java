import java.util.Scanner;
public class factorial {
public static void main(String args[]) {
	int n,f=1;
	System.out.println("enter the no:");
	Scanner sc = new Scanner(System.in);
			n= sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		f=f*i;
		}
	System.out.println("the factorial of"+n+"is "+f);
	sc.close();
}
}
