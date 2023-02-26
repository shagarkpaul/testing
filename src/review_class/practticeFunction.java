package review_class;

public class practticeFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findEven(23));
		
		
		findOdd(23);

	}
	
	public static String findEven(int x) {
		
		if (x % 2 == 0) {
			
			return "it is even number.";
		}
		else {
		
		return "It is not even";
		}
	}
	
	public static void findOdd(int x) {
		
		if(x % 2 != 0) {
			System.out.println("It is odd number");
		}
		else {
			
			System.out.println("It is not odd number");
		}
			}
	
	
	
	
	
}
