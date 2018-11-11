import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		int n;
		int a[]= new int[10];
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		int temp= a[0];
	for(int i=0;i<n;i++)
	{
		if(temp > a[i])
			temp = a[i];
			}
	int max = a[0];
	for(int i=0;i<n;i++)
	{
		if(max < a[i])
			max = a[i]; 
	}
	System.out.println("smallest no:"+temp);
	System.out.println("largest no:"+max);
	sc.close();
	}
}
