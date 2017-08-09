import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Worker{

	String wName;
	short noOfHours;
	float wagePerHour;


	public void read() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--------WORKER INFORMATION--------");
		System.out.println("Enter the name :");
		wName=br.readLine();
		System.out.println("Enter the number of hours worked in a day:");
		noOfHours=Short.parseShort(br.readLine());
		System.out.println("Enter the  wage per hour:");
		wagePerHour=Float.parseFloat(br.readLine());
	}

	public float calcwg(){
		float wagePerday = wagePerHour * noOfHours;
		return wagePerday;

	}
	public float extraWage(){
		
		float wp = calcwg();
		float extraWage;

		if(wp < 200)
		{
			extraWage=150;
		}
		else
		{
			extraWage=50;
		}
		return extraWage;
	}

	public float totalWage(){
		float finalWage= extraWage();
		float wp = calcwg();
		
		float totalWage = wp+ finalWage;
		return totalWage;

	}
	public void display(){
		float twage = totalWage();
		System.out.println("Name of the worker:"+ wName);
		System.out.println("No of hours worked"+ noOfHours);
		System.out.println("Wage per hour:"+ wagePerHour);
		System.out.println("Wage of the worker:"+ calcwg());
		System.out.println("Extra Wage:"+ extraWage());
		System.out.println("Total wage:"+ totalWage());

	}

	public static void main(String[] args) throws IOException{

		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		Worker w1= new Worker();
		w1.read();
		w1.display();
		
	}
}