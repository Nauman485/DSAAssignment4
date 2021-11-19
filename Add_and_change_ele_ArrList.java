package geekster;
import java.util.*;

public class Add_and_change_ele_ArrList {
	
	public static void main(String []args) {
		
		ArrayList<String> arr= new ArrayList<>();
		
		arr.add("Aman");
		arr.add("Amar");
		arr.add("Amit");
		arr.add("Suman");
		arr.add("Sonam");
		arr.add("Suresh");
		
		arr.set(3, "Akash");
		for(String val:arr) {
			System.out.println(val);
		}
	}

}
