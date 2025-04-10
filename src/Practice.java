//import java.util.Scanner;
//
//public class Practice {
//	
//	class Employee{
//		String EmpName;
//		int Empid;
//		double EmpSal;
//		
//		
//		Employee(){
//			EmpName="himashu";
//			Empid=23;
//			EmpSal=6805459.00;
//		}
//		
//		public  void Empdetails() {
//			System.out.println(EmpName);
//		}
//		
//		public  void Empdetails(String EmpName) {
//			System.out.println(EmpName);
//			 Scanner sc = new Scanner(System.in);
//		        EmpName=sc.nextLine();
//		        System.out.println(EmpName);
//		        
//		}
//	
//	
//	
//	public static void main(String[] args) {
//		Employee obj =new Employee();
//		obj.Empdetails();
//		obj.Empdetails("Himanshu");
//	}
//	}}
//
//	
//

import java.util.Scanner;

public class Practice { // Main class
    class Employee { // Nested class
        String EmpName;
        int Empid;
        double EmpSal;

        Employee() {
            EmpName = "himashu";
            Empid = 23;
            EmpSal = 6805459.00;
        }

        public void Empdetails() {
            System.out.println(EmpName);
        }

        public void Empdetails(String EmpName) {
            System.out.println(EmpName); // Print parameter
            Scanner sc = new Scanner(System.in);
            this.EmpName = sc.nextLine(); // Update instance variable
            System.out.println(this.EmpName); // Print updated instance variable
        }
    }

    public static void main(String[] args) { // Corrected main method placement
        Practice p = new Practice(); // Create instance of Practice to access Employee
        Employee obj = p.new Employee(); // Create instance of nested class

        obj.Empdetails(); // Print default details
        obj.Empdetails("Himanshu"); // Overload method with parameter
    }
}
 




public class BankBase{
	
}




























