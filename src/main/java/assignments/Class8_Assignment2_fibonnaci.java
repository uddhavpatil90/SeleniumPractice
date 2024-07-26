package assignments;

public class Class8_Assignment2_fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a program for fibonaci series
		// input : 0,1,1,2,3,5,8,13,.....
		
		int num1=0;
		int num2=1;
		int num3;
		int maxValue=10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i=2;i<maxValue;++i) // why -- ?
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;   // first assign num2 to num1
			num2=num3;   // then assign num3 to num2
		}

	}

}
