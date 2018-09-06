package vecka36;

import java.util.Scanner;

public class uppg7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int tal = sc.nextInt();
		boolean isPrim = true;
		
		if(tal % 2 == 0){
			isPrim = false;
		}
		
		for (int i = 3; i < Math.sqrt(tal); i += 2) {
			if (tal % i ==0){
				isPrim = false;
				break;
			}
		}
		
		if (isPrim){
			System.out.println("PRIMTAL");	
		} else{
			System.out.println("EJ PRIMTAL");
		}
	}

}
