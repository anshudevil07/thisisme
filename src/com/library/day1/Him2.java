//package com.library.day1;
//
//public class Him2 {
// 
//	
//		
//	public  void func1(int a,int b) {
//		    System.out.println(a+b);
//		}
//		
//		public String func2(String s) {
//		    int i=0;
//		    int j=s.length();
//		    String ans="";
//		    while(i<=j) {
//		    	ans+=s[j];
//		    	j--;
//		    	i++;
//		    }
//			
//		    return ans;
//		}
//	
//}
package com.library.day1;

import java.util.Arrays;

public class Him2 {

    public void func1(int a, int b) {
        System.out.println(a + b);
    }

    public String func2(String s) {
        int i = 0;
        int j = s.length() - 1; 
        String ans = "";
        while (j >= 0) { 
            ans += s.charAt(j);
            j--; 
        }
        return ans;
    }
    
    public int Reverse(int num) {
    	int ans=0;int rem;
    	while(num>0) {
    	     rem=num%10;
    	     ans =ans*10+rem;
    	    
    	      num=num/10;
    	}
    	return ans;
    	
     }
    public int fact(int num) {
    	int ans=1;
    	for(int i=num ; i>0;i--) {
    		ans=ans*i;
    	}
    	return ans;
    }
   
    //1
    public int[] arr(int num[]) {
         Arrays.sort(num);
         return num.toString()
    }
    
    
    public int[] arr2(int num[]) {
    	return Arrays.sort(num, Collections.reverseOrder());    
    	}
    
    public int[] Avgg(int num[]) {
    	int sum=0;
    	for(int i=0 ; i<num.length;i++) {
    		sum+=num[i];
    	}
    	int ans=sum/num.length;
    }
    
       
}

