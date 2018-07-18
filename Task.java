import java.util.Scanner;
class Task{
	public static void main(String [] args){
	int i,j,n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter n value");
	n=s.nextInt();
	for(i=n;i>=1;i--)
	{
		for(j=n;j>i;j--)
		{
		 System.out.print(j);
		}
		for(j=1;j<=(i*2-1);j++)
		{
		 System.out.print(i);
		}
		for(j=i+1;j<=n;j++)
		{
		 System.out.print(j);
		}
		System.out.println("\n");
	}
	for(i=1;i<n;i++)
	{
		for(j=n;j>i;j--)
		 {
		 System.out.print(j);
		 }
		for(j=1;j<=(i*2-1);j++)
		{
		 System.out.print(i+1);
		}	
		for(j=i+1;j<=n;j++)	
		{
		 System.out.print(j);
		}
		 System.out.println("\n");
	}	
}
}	
