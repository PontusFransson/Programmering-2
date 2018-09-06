package vecka36;

import java.util.ArrayList;
import java.util.Collections;

public class sortera {

	public static void main(String[] args) {
		int[] arr = {1,24,234,2345,235,25,235,23523};
		
		int[] sorterad1 = sort(arr);
		int[] sorterad2 = sort(22,314,14,1,241,41,124);
		
		for (int i : sorterad1) {
			System.out.println(i + " ");
		}
		System.out.println();
		for (int i : sorterad2) {
			System.out.println(i + " ");
		}
		}
		
	public static int[] sort(int...massa_tal){
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int tal : massa_tal) {
			arrayList.add(tal);
		}
		
		Collections.sort(arrayList);;
		
		for (int i = 0; i < arrayList.size(); i++) {
			massa_tal[i] = arrayList.get(i);
		}
		return massa_tal;
				
	}
	
}
