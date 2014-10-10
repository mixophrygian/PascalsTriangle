import java.util.Scanner;


public class PascalsTriangle {
	
	private static Scanner in;
 public static void main(String [] args){
	 in = new Scanner(System.in);
	 System.out.print("This program will tell you how many unique combinations you can create.");
	 System.out.print("\n");
	 System.out.print("Enter the total number of items you have to choose from. E.G. number of players on a full team.");
	 int n = in.nextInt();
	 System.out.print("Now enter the number of items you would like to combine, as a subset of the total. E.G. number of players allowed in a game at a time.");
	 int k = in.nextInt(); 
	 while(k > n){
		System.out.print("You cannot select more items from a list than it contains! Duh!");
		 System.out.print("Enter a number of items FEWER THAN THE LIST SIZE that you want to combine.");
		 n = in.nextInt();
	 }
	 System.out.print("The number of unique ways you could pick " +k+ " items from " +n+ " is " +Combinations(n, k));
 }
private static int Combinations(int n, int k) {
	/*A recursive method to determine how many ways you can organize n elements from k elements.
	 * Assumes that the user isn't stupidly trying to select more items than 
	 * the list contains*/
	if(n == 0 || k == 0) return 0; 
	if(n == k) return 0;
	if(n == 1 & k == 1) return 1;
	return (Factorial(n) / (Factorial(k) * Factorial(n - k)));
}
private static int Factorial(int n) {
	//a recursive factorial method//
	if(n == 0) {
		return 1;
	}else{
		return n * Factorial(n-1);
	}
}
}
