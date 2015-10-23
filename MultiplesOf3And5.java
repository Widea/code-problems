// program to compute the sum of all multiples of 3, 5 below 100.

import java.util.HashMap;

public class MultiplesOf3And5 {
	public static void main(String[] args) {
		HashMap<Integer,Boolean> map = new HashMap<>();	
		long sum = 0;
		for(int i = 3; i < 100 ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				if(!map.containsKey(i)) {
					map.put(i, true);
					System.out.print(i + " ");
					sum+=i;
				}
			}
		}
		System.out.print("\nThe sum of is: "+sum);
	}
}
