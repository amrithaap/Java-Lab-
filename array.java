import java.io.*;
class Myarray
{
	private int arr[];
	private int n;
	Myarray(int a)
	{
		
		arr=new int[a];
		n=a;
	}
	public void readArray()throws IOException
	{
		int i=0;
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
	}
	public void displayArray()
	{
		int i=0;
		System.out.println("array elements are\n");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("highest number="+highestnumber());
		System.out.println("sum of highest and second highest number="+sum());
	}
	public int highestnumber()
	{
		int large=arr[0];
		for(int i=0;i<n;i++)
		{
			if(large<arr[i])
			{large=arr[i];}
				
		}
		return large;
	}
	public int sum()
	{
		int i=0;
		int large=highestnumber();
		
		int large2=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]!=large)
			{
				if(large2<arr[i])
				{large2=arr[i];}
				
			}
			
		}
		
		return(large+large2);
	}
	
}


public class array
{
	public static void  main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		Myarray m=new Myarray(n);
		
		m.readArray();
		m.displayArray();
	}
}
