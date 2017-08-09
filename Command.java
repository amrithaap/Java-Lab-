import java.io.*;
import java.util.Scanner;

public class Command{

	String pName;
	long phoneNo;
	char gender;
	Float docFee;
	byte age;
	Double billAmount;
	
	
	public Command(){					//default constructor 
		pName="amritha";
		phoneNo=25220133;
		docFee=(float)2500.0;
		age=22;
		billAmount=1000.0;
		gender='f';
	}

	public Command(String a ,Byte b,long c, char d){			//parametrized constructor
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
	Command p = new Command("lala",(byte)22,25134141,'m'); //parameterized constructor calling
     p.display();
     Command p1= new Command();  //default constructor  calling
   boolean choice=true;
	 	byte result;
	 	double dis,tot; 
	 Command pat[] = new Command[3];
	 while(choice)
	 	{
	 		System.out.println("1. Read data");
     		System.out.println("2. Display data");
     		System.out.println("3. Your Detils");
      		System.out.println("4. Exit");

     		System.out.println("Enter your choice");

     		result=Byte.parseByte(br.readLine());
     		switch(result){
     			case 1: for (int i=0;i<2 ;i++ ) {
     				pat[i] = new Command();
     				pat[i].read();
     			}
     			break;

     			case 2: for (int i=0;i<2 ;i++ ) {
     				pat[i].display();
     				
     			}
     			break;
     			case 3:
						System.out.println("\tName         :"+args[0]);
						System.out.println("\tAge          :"+args[1]);
						System.out.println("\tGender       :"+args[2]);
						System.out.println("\tPhone no     :" +args[3]);
						System.out.println("\tREg fee :"+args[4]);

						dis=Double.parseDouble(args[4])*.25;
						System.out.println("\tDiscount(25%):"+dis);
						tot=Double.parseDouble(args[4])-dis;
						System.out.println("\tTotal        :"+tot);
						
						break;

     			case 4:
     					choice=false;
     					break;
     		}
	
     
  }
}

}