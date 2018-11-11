import java.util.Scanner;
public class Biggest_nNumbers {
	public static void main(String args[]) {
		int a[],temp;
		int i,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		n= sc.nextInt();
		a= new int[n];
		for(i=0;i<n;i++)
		{
			
			a[i]= sc.nextInt();
		}
		for(i=0; i< n; i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
				System.out.println(a[n]);
			}
			
			
		}
		sc.close();
	}
}
