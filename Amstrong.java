import java.util.Scanner;
public class Amstrong {
public static void main(String args[])
{
	int n,r,safe,sum=0;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	safe=n;
	while(n>0)
	{
		r=n%10;
	     n=n/10;
	sum=sum+(r*r*r);
	}
	if(safe==sum)
	System.out.println("amstrong no");
	else
		System.out.println("not a amstrong no");
	sc.close();
}
}
