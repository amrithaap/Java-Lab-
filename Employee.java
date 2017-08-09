import java.io.*;
import java.util.Scanner;

public class Employee123{
	private long empId;
	private String empName;
	private float basicPay,da,hra;
	static long eId;


	static{
		eId=10;
	}
	public Employee123()
    {
        eId++;
       empId = eId;
    }


	public void readData() throws IOException{

		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("--------------EMPLOYEE INFORMATION--------");
		System.out.println("ENter employee name");
		empName=br.readLine();
		System.out.println("Enter basicPay");
		basicPay=Float.parseFloat(br.readLine());
		System.out.println("Enter DA");
		da=Float.parseFloat(br.readLine());
		System.out.println("Enter HRA");
		hra=Float.parseFloat(br.readLine());


	}

	public float  calculateSalary(){
		da=(float)basicPay*(float)0.5;
		hra=(float)basicPay*(float)0.1;
		return(basicPay+da+hra);

	}
	

	public void  display() throws IOException{
		System.out.println("Employee Details");
		System.out.println("*************************");
		System.out.println("\tEmployee Name :"+empName);
		System.out.println("\tEmployee ID   :"+empId);
		System.out.println("\tBasic Pay     :"+basicPay);
		System.out.println("\tDA            :"+da);
		System.out.println("\tHRA           :"+hra);
		System.out.println("\tTotal Salary  :"+ calculateSalary());
		System.out.println("\n");
	

	}

 public static void main(String[] args)  throws IOException
 {
 	Employee123 emp =new Employee123();
 	emp.readData();
 	emp.display();

		
	}
}