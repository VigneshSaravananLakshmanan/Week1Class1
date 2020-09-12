package week1.day1;

public class Fibanocci {

	
	public static void main(String[] args) {
		
	
		int i = 0;
		int j = 1;
		
		for (int fibonociRange = 0; fibonociRange < 8; fibonociRange++) {
			
			
			System.out.println(i);
			
			int temp;
			
			   temp = i+j;
			   i = j;
			   j = temp;
			   
			
		}
	}
}









