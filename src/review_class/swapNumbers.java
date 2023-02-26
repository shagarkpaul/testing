package review_class;



public class swapNumbers {
	
	
	public static void main(String[] args) {
		
		addition(23, 67);
		
		swapNumbers sn = new  swapNumbers();
		sn.subtraction(23, 12);
		
		System.out.println(sn.multiplication(3, 4));
		System.out.println(sn.division(23,21));
		
				}
	
	
	public static void addition(int x, int y) {
		
		int total = x + y;
		System.out.println(total);
		subtraction(23, 45);
	}
	
	public static void subtraction(int x, int y) {
		int sub = x - y;
		System.out.println(sub);
	}
	
	public int multiplication(int x, int y) {
		
		int multi = x * y;
		return multi; 
	}
	
	public double division(int x, int y) {
		int div = x/y;
		return div ;
	}
	}
	
	
	


