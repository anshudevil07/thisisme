import java.util.*;

public class Assigment { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
//            sc.nextLine(); 
//            String s = sc.nextLine();
//            String s2 = sc.nextLine();
//            String s3 = sc.nextLine();
//            int id = sc.nextInt();
//            float salary = sc.nextFloat();
//
//            Data obj = new Data(s, s2, s3, id, salary);
//            System.out.println(obj.name + " " + obj.LastName + " " + obj.Gender + " " + obj.eid + " " + obj.sal);
        	String s = sc.nextLine();
        	String s2 = sc.nextLine();
        	String s3 = sc.nextLine();
        	int id = 0;

            try {
                id = Integer.parseInt(sc.nextLine()); // Ensures valid integer input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for ID. Please enter a numeric value.");
                return;
            }
        Data obj = new Data(s, s2, s3, id);
        System.out.println(obj.name + " " + obj.LastName + " " + obj.Gender + " " + obj.eid+ " "
        		);
        }

//        sc.close(); 
    }
}

class Data {
//    String name, LastName, Gender;
//    int eid;
//    float sal;
//
//    Data(String name, String lastName, String gender, int id, float salary) {
//        this.name = name;
//        this.LastName = lastName;
//        this.Gender = gender;
//        this.eid = id;
//        this.sal = salary;
//    }
	String name, LastName, Gender;
    int eid;
	Data(String name, String lastName, String gender, int id) {
        this.name = name;
        this.LastName = lastName;
        this.Gender = gender;
        this.eid = id;
    }
}
