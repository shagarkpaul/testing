package review_class;

public class findEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findNumbers(0, 2);
		
		

	}
	
	public static void findNumbers(int x, int y) {
		
		if( x > 0) {
			
			if ( x > y) {
				System.out.println(" X is positive and  more than y");
			}
			else if ( x < y) {
				System.out.println(" X is positive and  less than y");
			}
		}
		
      if( x < 0) {
			
			if ( x > y) {
				System.out.println(" X is negetive and  more than y");
			}
			else if ( x < y) {
				System.out.println(" X is negetive and  less than y");
			}
		}
	}

}
