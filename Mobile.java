package week1.day1;

public class Mobile {
	
	 long mobNumber = 9234567890L;
	 String mobColour = "White";
	  double mobWeightInGms = 350;
	  boolean isRefurbished = false;
	  
	public void makeCall() {
		
		System.out.println("This feature is to make a call");
		// TODO Auto-generated method stub
		

	}
	
	public void sendMessage() {
		// TODO Auto-generated method stub
		
		
		System.out.println("This feature is to Send message");
		

	}
	
	public void takePhoto() {
		// TODO Auto-generated method stub
		
		System.out.println("This feature is to take Photo");

	}
	
	public static void main(String[] args) {
		
		Mobile mobileFeature = new Mobile();
		mobileFeature.makeCall();
		mobileFeature.takePhoto();
		System.out.println(mobileFeature.mobNumber);
		
		String Colour = mobileFeature.mobColour;
		System.out.println(Colour);
		System.out.println(mobileFeature.isRefurbished);
		System.out.println(mobileFeature.mobWeightInGms);
		
		
	}

}
