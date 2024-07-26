package live_classes;

public class Class10_2_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1 to define *Recomended way -> cause we will get values from CSV,excel, DB*
		int[][] arr= new int [2][3];
		arr[0][0]=34;
		arr[0][1]=65;
		
		System.out.println(arr[0][1]);
		
		// method 2 to define (on the fly type)
		int[][] arr1 = {{12,45},{35,87}};
		
		System.out.println(arr1[0][1]);
		
	}

}
