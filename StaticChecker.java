import java.io.*;
import java.util.Scanner;

class Customer
{
	private String custName;
	private byte custAge;
	private long accNumber;
	private char gender;
	private short minBal;
	private long cusId;
	static long scustId;
	private float balance;
	static
	{
			int a=10;
			int b =20;
			int c=a+b;
			scustId=100;
			System.out.println(c);
			System.out.println(scustId);
	}
	public static void show()
	{
		System.out.println("Last Employedd ID: "+scustId);
	}
	public Customer()
	{
		scustId++;
		cusId=scustId;
	}
	public void read() throws IOException
		{
			BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the customer name: ");
			custName = br.readLine();
			System.out.println("Enter the age of the Customer");
			custAge= Byte.parseByte(br.readLine());
			System.out.println("Enter the account no of the customer");
			accNumber=Long.parseLong(br.readLine());
			System.out.println("Enter the minimum balance");
			minBal = Short.parseShort(br.readLine());
			System.out.println("Enter the balance");
			balance = Float.valueOf(br.readLine()).floatValue();
			System.out.println("Enter the gender");
			gender = (char)br.read();
		}
	public void disp()
		{
			System.out.println("\n Customer Name: \t"+custName);
			System.out.println("\n Age of the customer: \t"+custAge);
			System.out.println("\n The Account number of the Customer: \t"+accNumber);
			System.out.println("\n Minimum Balance: \t"+minBal);
			System.out.println("\n Balance: \t"+balance);
			System.out.println("\n Gender: \t"+gender);
			System.out.println("\n Display the Customer : \t"+cusId);
		}
		
		
		public Customer(String a,byte a1)
		{
			System.out.println("hello");
			custName=a;
			custAge=a1;
			accNumber=1;
			gender='F';
			minBal=0;
			balance=0;			
		}
		public Customer(String b,long ac,char gen)
		{
			System.out.println("hello");
			custName=b;
			custAge=0;
			accNumber=ac;
			gender=gen;
			minBal=0;
			balance=0;			
		}
		byte search(String name)
		{
			if(custName.equals(name))
					return 1;
			else 
					return 0;
		}
		byte search(long acno)
		{
			if(accNumber==acno)	
				return 1;
			else 
				return 0;
		}
		byte search(float bal, char gend)
		{
			if( bal>=balance && gender==gend)
				return 1;
			else 
				return 0;
		}
}
public class StaticChecker
{
	public static void main(String args[]) throws IOException
	{
		/*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean ch =true;
		byte res,res1,b1=0;
		Customer ob1=new Customer("ss",1255688,'M');
		ob1.disp();
		Customer obj[]= new Customer[2];  // means array of objects
		while(ch)
		{
			System.out.println("1.Read Data");
			System.out.println("2.Display data");
			System.out.println("3. Search the name");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			res=Byte.parseByte(br.readLine()); //read the choice
			switch(res)
			{
				case 1:
						for (byte i=0; i<2;i++)
						{
							obj[i]=new Customer();
							obj[i].read();
						}
						break;
				case 2:
						for(byte i=0;i<2;i++)
						{
							obj[i].disp();
						}	
						break;
				case 3:	
						System.out.println("1. By Name: \t");
						System.out.println("2. By Account number: \t");
						System.out.println("3. By balance and gender: \t");
						
						System.out. println("Enter your choice: \t");
						res1= Byte.parseByte(br.readLine());
						switch(res1)
						{
							case 1:  
									String n;
									//System.out.println("Enter the name to search:\t");
									//n=br.readLine();
									n=args[0];
									for(byte i=0;i<2;i++)
									{
										b1=obj[i].search(n);
										if(b1==1)
										{
											obj[i].disp();
											break;
										}
									}
									if(b1==0)
									{
										System.out.println("record is not available");
									}
									break;
							case 2:
									long acno;
									System.out.println("Enter the account no to search");
									acno=Long.parseLong(br.readLine());
									for(byte i=0;i<2;i++)
									{
										b1=obj[i].search(acno);
										if(b1==1)
										{
											obj[i].disp();
											break;
										}
									}
									if(b1==0)
									{
										System.out.println("record is not available");
									}
									break;
							case 3:
									char gender;
									float balance;
									System.out.println("Enter the gender to search: \t");
									gender=(char)br.read();
									System.out.println("Enter the balance amount to search");
									br.skip(2);
									balance=Float.parseFloat(br.readLine());
									for(byte i=0;i<2;i++)
									{
										b1=obj[i].search(balance,gender);
										if(b1==1)
										{
											obj[i].disp();
											break;
										}
										if(b1==0)
										{
											System.out.println("Record is not available");
										}
										break;
									}
						} break;// end of inner switch
				case 4:
						ch= false;
			} // end of outer switch
		}//end of while*/
		Customer obj=new Customer();
		//obj.show();
		Customer.show();
	}//end of main
	
}// end of class
