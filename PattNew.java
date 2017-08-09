import java.io.*;
import java.util.Scanner;

public class PattNew{

	String pName;
	long phoneNo;
	char gender;
	Float docFee;
	byte age;
	Double billAmount;
	
	
	public PattNew(){					//default constructor 
		pName="amritha";
		phoneNo=25220133;
		docFee=(float)2500.0;
		age=22;
		billAmount=1000.0;
		gender='f';
	}

	public PattNew(String a ,Byte b,long c, char d){			//parametrized constructor
		pName=a;
		age=b;
		phoneNo=c;
		docFee=(float)2000.0; 
		billAmount=5000.0;
		gender=d;
	}
	
	public void read() throws IOException{

   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  
		System.out.println("--------PATIENT INFORMATION--------");
		System.out.println("Enter the patient Name");
		pName=br.readLine();
		System.out.println("Enter the patient phoneno");
		phoneNo=Long.parseLong(br.readLine());
		System.out.println("Enter the doctors fee");
		docFee=Float.parseFloat(br.readLine());
		System.out.println("Enter age of the patient");
		age=Byte.parseByte(br.readLine());
		System.out.println("Enter the billAmount");
		billAmount=Double.parseDouble(br.readLine());
		System.out.println("Enter gender");
		gender=(char)br.read();

	}
	public void display(){

		System.out.println("Name :"+ pName);
		System.out.println("Phoneno:"+ phoneNo);
		System.out.println("Doctors fee"+ docFee);
		System.out.println("Age:"+ age );
		System.out.println("Billamount"+ billAmount );
		System.out.println("tax"+ bill( ) );
		System.out.println("total amount"+ bill(billAmount , bill() , docFee  ) );
		System.out.println("Gender:"+ gender);
	}

public Double bill(){
	Double tax= 150.0;
	return tax;
}

public Double bill(Double a, Double b, Float c){
	Double	tax;
	billAmount=a;
	tax=bill();
	tax=b;
	docFee=c;
	return(a+b+c);
}

public static void main(String args[]) throws IOException{

     BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
	PattNew p = new PattNew("lala",(byte)22,25134141,'m'); //parameterized constructor calling
     p.display();
     PattNew p1= new PattNew();  //default constructor  calling
   /* p1.display();
        PattNew p2= new PattNew();
        p2.read();
        p2.display();*/
     /*BufferedReader br =new BufferedReader (new InputStreamReader(System.in));*/
	 	boolean choice=true;
	 	byte result;
	 PattNew pat[] = new PattNew[3];
	 while(choice)
	 	{
	 		System.out.println("1. Read data");
     		System.out.println("2. Display data");
      		System.out.println("3. Exit");
     		System.out.println("Enter your choice");

     		result=Byte.parseByte(br.readLine());
     		switch(result){
     			case 1: for (int i=0;i<2 ;i++ ) {
     				pat[i] = new PattNew();
     				pat[i].read();
     			}
     			break;

     			case 2: for (int i=0;i<2 ;i++ ) {
     				pat[i].display();
     				
     			}
     			break;

     			case 3:
     					choice=false;
     					break;
     		}
	
     
  }
}

}