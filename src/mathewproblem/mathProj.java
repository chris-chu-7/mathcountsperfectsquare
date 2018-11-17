//Christopher Chu Github: wanderingessence98 
//Date: 11/4/2018 
//Duration: 4 hours to complete.

//This algorithm implementation solves a classic MathCounts problem

//Given an nxn square, what is the maximum amount of squares that can be formed out of the
//indices. The solution entails the following algorithm. For example, out of a 2x2 square, for each
//index i,j, one 1x1 and one 2x2 square can be formed. Since there are 4 squares of unit 1 inside the 2x2 square,
//the total amount of squares formed is 8. 

//Algorithm runs in O(n^3) and takes O(1) space. O(n^2) for to iterate over each square of unit one, and O(k) to iterate
//every each number from k = 1..n to see how many squares of size k*k can be formed from a particular index. O(1) space
//because of the automatic garbage disposal methods of java.

package mathewproblem;
import java.util.Scanner;
 

public class mathProj {
	private static Scanner numInput;
	public static int findSum(int n) {
			int total = 0 + 0;
			for(int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					for(int k = 1; k <= n; k++) {
						int mini = Math.min(i, n-i+1), minj = Math.min(j, n-j+1), mink = Math.min(k, n-k+1);
						int local = Math.min(mini, mink) * Math.min(minj,  mink);
						total += local;
					}
				}
				
			}
			
			return total;
	}

	public static void main(String[] args) {	
			boolean isNumber = false;
			while(!isNumber) {
				System.out.print("Enter a number: ");
				numInput = new Scanner(System.in);
				if(numInput.hasNextInt()) {
					int n = numInput.nextInt();
					System.out.println();
					for(int i = 0; i <= n; i++) {
						if(i != n) {
							System.out.print( i + ":" + findSum(i) + ", \n");
						} else {
							System.out.print( i + ":" + findSum(i));
						}
					}
					isNumber = true;
				} else {
					System.out.println("Invalid input. Please enter a positive integer. \n");
				}
			}		
	}
	
	
}
