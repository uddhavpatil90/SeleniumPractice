package class_26_exception_handling;

import java.util.Scanner;

public class Exception_Handline_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
		
			System.out.println("enter num1");		
			int num1= sc.nextInt();
	
			System.out.println("enter num2");
			int num2 = sc.nextInt();
	
			int result=num1/num2;
			System.out.println("result" +result);
			
		} catch (Exception e) {
			
					}
		
		
	}	
	
}
