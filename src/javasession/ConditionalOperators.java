package javasession;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25,b = 78, c = 87, d = 97;
		
		// Print greatest number out of four different given number
		
		if(a > b) {
			System.out.println("Greatest number is"+ a);
		}else if (b > c) {
			System.out.println("Greatest number is"+ b);
		}else if ( b > c) {
			System.out.println("Greatest number is"+ c);
		}
		System.out.println("Greatest number is "+ d);
	}
}

