import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		int n,i,flag=0;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(i=2;i< n/2;i++)
		{
			if(n%i==0) 
			{
				System.out.println("not a prime");
				 flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println("prime no");
			sc.close();
		}
	}
}
