package review_class;

public class praticeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDates("Wednesday");

	}
	
	public static void findDates(String s) {
		
		
		switch(s) {
		
		case "Monday": 
			System.out.println("This the first day of the week.");
			break;
		case "Tuseday": 
			System.out.println("This the Second day of the week.");
			break;
		case "Wednesday": 
			System.out.println("This the third day of the week.");
			break;
		case "Thursday": 
			System.out.println("This the fourth day of the week.");
			break;
		case "Friday": 
			System.out.println("This the fivth day of the week.");
			break;
		case "Saturday": 
			System.out.println("This the  sixth day of the week.");
			break;
		case "Sunday": 
			System.out.println("This the seventh day of the week.");
			break;
		
		default: 
			System.out.println(s + " is not valid dates name.");
		
		}
	}

}
