// program to compute the sum of all multiples of 3, 5 below 100.

public class MultiplesOf3And5 {
	public static void main(String[] args) {
		long sum = 0;
		for(int i = 3; i < 100 ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
					System.out.print(i + " ");
					sum+=i;
			}
		}
		System.out.print("\nThe sum of is: "+sum);
	}
}
