import java.util.Scanner;
import java.io.*;

abstract class Department{
 	public int deptId;
    String deptType;
    abstract float annualIncome();



    public Department()
    {
       deptId = 1;
        deptType = "oncology";
    }
    
    public Department(int deptid, String depttype)
    {
        this.deptId = deptid;
        this.deptType = depttype;
    }


     public void read() throws IOException
    {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("Enter Department Id: ");
        deptId = Integer.parseInt(br.readLine());
        System.out.println("Enter Department Type: ");
        deptType = br.readLine();
    }

     public void display() throws IOException
    {
        System.out.println("Department Details");
        System.out.println("**************");
        System.out.println("Department Id: "+deptId);
        System.out.println("Department Type: "+deptType);
        System.out.println("**************");
    }

}

	class Neurology extends Department{
		
		private int numOfspecialists;
		private String docName;
		private long deptmobNo;
		private int numofPatients;
		private int numofemployers;
		private float income;
		private int roomId;
		  private String email;

		public Neurology(){
			super();
			numOfspecialists=7;
			docName="Dr.Bhat";
		 	deptmobNo=9946381238L;
		 	numofPatients=41;
		 	numofemployers=19;
		 	income=97000.00f;
		 	email = "admin@neurology.com";
		 	roomId=32;
		}
		public Neurology(int deptid, String depttype, String name, String eid) {
        super(deptid, depttype);
        this.docName = name;
        deptmobNo = 98123054780L;
        this.email = eid;
        numOfspecialists=7;
        numofPatients=41;
		numofemployers=19;
		income=97000.00f;
		roomId=6;
    }

    public void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.read();
        System.out.println("Enter number of specialists in the department");
        numOfspecialists =Integer.parseInt(br.readLine());
        System.out.println("Enter name of the doctor");
        docName=br.readLine();
        System.out.println("Enter department phone number");
        deptmobNo=Long.parseLong(br.readLine());
         System.out.println("Enter number of patients admiitted in the department");
        numofPatients =Integer.parseInt(br.readLine());
        System.out.println("Enter number of employers working in the department");
        numofemployers =Integer.parseInt(br.readLine());
        System.out.println("Enter email of  the department");
        email=br.readLine();
        System.out.println("Enter the total income of the department");
        income =Float.parseFloat(br.readLine());
        System.out.println("Enter the room number");
        roomId =Integer.parseInt(br.readLine());
        
     }
     public void display() throws IOException {
        super.display();
        System.out.println("DEPARTMENT Details");
        System.out.println("**************");
        System.out.println("NUMBER OF SPECIALISTS: " +numOfspecialists );
        System.out.println("NUMBER OF PATIENTS:" + numofPatients);
        System.out.println("NUMBER OF EMPLOYERS:" + numofemployers);
        System.out.println("Mobile No: " + deptmobNo);
        System.out.println("Email: " + email);
        System.out.println("Income: " + income);
        System.out.println("ROOM ID: " + roomId);
        System.out.println("doctor Name: " + docName);
        System.out.println("**************");
    }

     float annualIncome() {
        return (income*12);
    }

    byte search(String name) {
        if (docName.equals(name)) {
            return 1;
        } else {
            return 0;
        }
    }

    byte search(int id) {
        if (deptId == id) {
            return 1;
        } else {
            return 0;
        }
    }


}



    public class Abstract{
    public static void main(String[] args) throws IOException {
    	
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ch = true;
        byte res, res1;
        byte b1=0;
        Department dep =new Neurology();
        dep.display();
    }
}
    