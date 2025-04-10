import java.util.*;
import java.util.Scanner;


public class day2 {
//	 public static double[] arr(double num[]) {
//         Arrays.sort(num);
////         return num.toString();
////         for(int i=0 ; i<num.length-1; i++) {
////        	 System.out.println(num[i]);
////         }
//         return num;
//    }
////    
////    
//    public static double[] arr2(double num[]) {
//    	Arrays.sort(num);
//    	double result[]= Collections.reverseOrder(num);    
//    	return result;
//    	}
////    
//    public static double Avgg(double num[]) {
//    	double sum=0;
//    	for(int i=0 ; i<num.length;i++) {
//    		sum+=num[i];
//    	}
//    	double ans=sum/num.length;
//    	return ans;
//    }
//    
//    
//    
//	public static void main(String args[]) {
//		
//		double salary[]=new double[10];
//		Scanner sc =new Scanner(System.in);
//		
//		for(int i=0 ; i<salary.length;i++) {
//			salary[i]=sc.nextDouble();
//		}
//		
//		 arr2(salary);
//		 
//		 
//		
//		for(double i:salary) {
//			System.out.println(i);
//		}
//		arr2(salary);
		
//		for(double i:salary) {
//			System.out.println(i);
//		}
		//23 54 756 243 86 34 65 34 756 53 
		
//		double result =Avgg(salary);
//		System.out.println(result);
		
//	}
//}

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class day2 {
//
//    
//    public static double[] arr(double[] num) {
//        Arrays.sort(num);
//        return num;
//    }
//
//    
//    public static double[] arr2(double[] num) {
//        Arrays.sort(num, Collections.reverseOrder());
//        return num;
//    }
//
//    
//    public static double Avgg(double[] num) {
//        double sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//        }
//        return sum / num.length; 
//    }
//
//    public static void main(String[] args) {
//
//        
//        double salary[] = new double[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 salary values:");
//
//        for (int i = 0; i < salary.length; i++) {
//            salary[i] = sc.nextDouble();
//        }
//
//        // Sort and print salaries in ascending order
//        arr(salary);
//        System.out.println("Salaries in ascending order:");
//        for (double i : salary) {
//            System.out.println(i);
//        }
//
//       
//   
//       
//
//        // Sort in descending order
//        arr2(salary);
//
//        System.out.println("Salaries in descending order:");
//        for (Double i : salary) { // Use 'Double' since it's a Double[] array
//            System.out.println(i);
//        }
//
//        }
//
//
//        // Calculate and print the average salary
//        double average = Avgg(salary);
//        System.out.println("Average salary: " + average);
//
//        sc.close(); // Close the Scanner to prevent resource leaks
//    }
//}

public static Double[] arr2(Double[] num) {
    Arrays.sort(num, Collections.reverseOrder());
    return num;  
}

public static void main(String[] args) {
    double[] salary = {5000.0, 3000.0, 7000.0, 1000.0};
    Double[] salaryDescending = new Double[salary.length];
    for (int i = 0; i < salary.length; i++) {
        salaryDescending[i] = salary[i]; // Convert to Double[]
    }

    arr2(salaryDescending);

    System.out.println("Salaries in descending order:");
    for (Double i : salaryDescending) {
        System.out.println(i);
    }
}}
