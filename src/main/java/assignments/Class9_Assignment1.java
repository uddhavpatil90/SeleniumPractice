package assignments;

public class Class9_Assignment1 {
	
	public static void main(String[] args) {
	
	// array initialization and assignment
				
	int arr[]=new int[5];
	arr[0]=90;
	arr[1]=78;
	arr[2]=56;
	arr[3]=87;
	arr[4]=34;
	

	//logic to print array elements in reverse order
	
	for (int i=4;i>=0;i--) //method 2 : for (int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
	
	
	}
}
