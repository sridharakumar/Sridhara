package TestJava;

import java.util.Scanner;

public class Problem2 {

	static void solution(int number) {
		 int nat=1;
		
		while(number!=0)
		{
			if(nat % 2 != 0)
			{
				System.out.print(nat +"\t"); 
				
				number--;
			}
			nat++;
			
		}
		
	}
		    
		     
		  
		    @SuppressWarnings("resource")
			public static void main(String argc[])
		    {
		    	int n;
		    	Scanner sc = new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				n = sc.nextInt();	
		       
		        solution(n);
		    }
}
		    
		

	


