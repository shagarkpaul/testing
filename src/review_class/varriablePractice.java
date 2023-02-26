package review_class;



public class varriablePractice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myarray = {1, 23, 98, 23, 103, 200};
		
		int largest = 0;
		int second = 0;
		
		for(int i =0 ; i < myarray.length; i++) {
			
			if (myarray[i] > largest) {
				
				second = largest;
				largest = myarray[i];
			}
			
			else if (myarray[i] > second) {
				
				second = myarray[i];
			}
		}
		
		System.out.println(second);
		
		
	}
	
	
	

}
