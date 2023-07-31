package javasession;

public class ArrayConsept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] emp = {"Volvo", "BMW", "Ford", "Mazda"};
		int count = emp.length-1;
		for(Object e :emp) {
			if(count >= 0) {
				System.out.println(emp[count]);
				//System.out.println(e);
			}
			count--;
		}

	}

}
