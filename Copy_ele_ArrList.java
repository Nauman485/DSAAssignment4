package geekster;

import java.util.ArrayList;

public class Copy_ele_ArrList {
	
public static void main(String []args) {
		
		ArrayList<String> arr1= new ArrayList<>();
		
		arr1.add("Aman");
		arr1.add("Amar");
		arr1.add("Amit");
		arr1.add("Suman");
		arr1.add("Sonam");
		arr1.add("Suresh");
		
		ArrayList<String> arr2= new ArrayList<>();
		
		for(String val:arr1) {
			arr2.add(val);
		}
		System.out.print(arr2);
	}

}
