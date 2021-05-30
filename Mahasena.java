import java.util.Scanner;

public class Mahasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=0;int o=0;
		/*int e=0;int o=0;
		while(n-->0)
		{
			int wp=sc.nextInt();
			if(wp%2==0)
			{
				e=e+1;
			}
			else
			{
				o=o+1;
			}
			
		}
		if(e>o)
		{
			System.out.println("READY FOR BATTLE" );
			
			
		}
		else
		{
			System.out.println("NOT READY" );	
		}*/
		int i=0;
		int army[]=new int[n];
		for( i=0;i<n;i++)
		{
			 army[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(army[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		if(e>o)
		{
			System.out.println("READY FOR BATTLE" );
		}
		else
		{
			System.out.println("NOT READY" );
		}
		 
	}

}
