package matchGameNew;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) {
		//new Board();
		
		Scanner scan = new Scanner(System.in);
		
		int list = scan.nextInt();
		
		StartGame game = new StartGame();
		
		List<Long> ar = new ArrayList<Long>();
		
		for(long i = 0; i < list; i++) {
			ar.add(scan.nextLong());
		}
		
		//for(long numm: ar) {
		//System.out.println(numm);}
		
		game.aVeryBigSum(ar);
		
	}
	
	 public static long aVeryBigSum(List<Long> ar) {
		 
		 long sum = 0;
		 for(long num: ar) {
			// System.out.println(num);
			 sum += num;
		 }
		
		System.out.println(sum);
		return sum;
		    

		    }

}
