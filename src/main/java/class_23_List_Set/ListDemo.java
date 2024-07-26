package class_23_List_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaration type 1
		 ArrayList list1 = new ArrayList();
		 
		 list1.add("uddhav");
		 list1.add("mahesh");
		 list1.add("Shiv");
		 list1.add("ganesh");
		 list1.remove(0);
		 System.out.println(list1);

		 // Declaration type 2
		 List<String> slist=Arrays.asList("one","two","three");
		 System.out.println(slist);
		 
		 
		 
		 
		 boolean b = list1.isEmpty();
		 boolean b1 = list1.contains("ganesh");
		 int lSize= list1.size();
		 
		 
		 // Different ways to write list
		 ArrayList l1=new ArrayList();
		 List l2 = new ArrayList();
		 Collection l3 = new ArrayList();
		 Iterable l4=new ArrayList();
		 Object l5=new ArrayList();
		 
		 // List with Generics
		 List <Integer> intList= new ArrayList();
		 intList.add(3);
		 intList.add(435);
		 intList.add(464);
		 intList.add(23423);
	
		 // Loop with list
		 for (int a:intList)
		 {
			 System.out.println(a);
		 }
		
		 //Nested Lists
		 List <String> morningBatch= Arrays.asList("Uddhav","Mahesh","Ganesh");
		 List <String> AfternoonBatch= Arrays.asList("Kumar","Siddhu","Narayan");
		 List <String> eveningBatch= Arrays.asList("Eve1","Eve2","Eve3");
		 
		 List<List<String>> masterBatch=new ArrayList();
		 masterBatch.add(morningBatch);
		 masterBatch.add(AfternoonBatch);
		 masterBatch.add(eveningBatch);
		 
		 System.out.println(masterBatch);
		 
		 
		 
		 
	}
	

}
