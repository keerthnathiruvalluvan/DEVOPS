import java.io.*;
public class Prime_range {
	public static void main(String args[])
	{
		int i=0,num=0;
		String primeNumbers = "";
		for(i=2;i<=100;i++)
		{
			int counter =0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter+1;
				}
			}
			if(counter==2)
			{
				primeNumbers = primeNumbers+i + "";
		}
	}
		System.out.println("prime numbers from 1 to 100 are:");
		System.out.println(primeNumbers);
	}
}
