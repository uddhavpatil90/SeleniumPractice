package assignments;

public class Class9_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		
		arr[0]=15;
		arr[1]=85;
		arr[2]=55;
		arr[3]=125;
		arr[4]=777;
		arr[5]=999;
		arr[6]=786;
		arr[7]=2233;
		
		boolean flgForLoop=false;
		boolean flgForEachLoop=false;
		
		for (int i=0;i<10;i++)
		{
			if (arr[i]==786)
			{
				flgForLoop=true;	//flgForLoop will true only if given condition true
			}
			
		}

		if (flgForLoop)
		{
			System.out.println("number found using 'for loop'");
		}
		else 
		{
			System.out.println("number is not present in given array using 'for loop'");
		}
		
		/* 
		 * Same solution replicated with for each loop
		 * 
		 * */
		for (int x:arr)
		{
			if (x==786)
			{
				flgForEachLoop=true; //flgForEachLoop will true only if given condition true
			}
		}
		
		if (flgForEachLoop)
		{
			System.out.println("number found using 'for each loop'");
		}
		else 
		{
			System.out.println("number is not present in given array using 'for each loop'");
		}
	}

}
