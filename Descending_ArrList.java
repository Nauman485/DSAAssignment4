package geekster;
import java.util.*;

public class Descending_ArrList {
	
	public static void main(String []args) {
		
		ArrayList<Integer> arr= new ArrayList<>();
		
		arr.add(20);
		arr.add(23);
		arr.add(14);
		arr.add(17);
		arr.add(3);
		arr.add(8);
		
		Collections.sort(arr,Collections.reverseOrder());
		
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
