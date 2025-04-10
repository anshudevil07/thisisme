import java.util.*;

import com.library.day1.Him2;
public class Hima {

	public static void main(String[] args) {
		Him2 o1=new Him2();
//		o1.func1(6, 9);
//		String  s=o1.func2("himNAHU");
//		System.out.println(s);
//		
//		
//		int ans1=o1.Reverse(112);
//		System.out.println(ans1);
//		
//		int ans2=o1.fact(5);
//		System.out.println(ans2);
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
	  switch(num) {
	  
	  case 1:
		     o1.func1(6, 9);
			break;
		 
	  case 2:
		  String  s=o1.func2("himNAHU");
			System.out.println(s);  
	  
	  case 3:
		  int ans1=o1.Reverse(112);
			System.out.println(ans1);
			
	  case 4:
		   int ans2=o1.fact(5);
			System.out.println(ans2);
			Scanner sc1=new Scanner(System.in);
			int num1=sc1.nextInt();
	}
	}
}
