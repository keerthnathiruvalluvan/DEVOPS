import java.util.Scanner;
public class Factorial_range {
public static void main(String args[])
{
	int a,b,f;
	Scanner sc = new Scanner(System.in);
	a= sc.nextInt();
    b=sc.nextInt();
    for(int i=a;i<=b;i++)
    {
    	f=1;
    	for(int j=1;j<=i;j++)
    	{
    		f=f*j;
    	}
    		System.out.println("factorial of"+i+f);
    	
    }
	sc.close();
}
}
