package JavaExercise;

public class calliPhoneclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to create an object/variables of a class you have to call/instantiate the class
		iPhone testiPhone = new iPhone(); // this is how to create an instance, variable, or object of a class
		
	
		
				
		
		// in other to be able to access all its datatypes and methods or actions use "."in front of your variable
		
		testiPhone.color = "red";
		System.out.println("This color is"+ " " + testiPhone.color );
		
		testiPhone.model = "iPhone10";
		System.out.println("My phone model is"+ " " + testiPhone.model);
		
		testiPhone.name = "Apple";
		System.out.print("my phone is named by" + " " + testiPhone.name);
		
		testiPhone.versionnumber = 225;
		System.out.println("this is my phone version number" + " " + testiPhone.versionnumber);
		
		
		testiPhone.contact();
		testiPhone.phoneMessaging();
		testiPhone.recording();
		testiPhone.video();
		testiPhone.phonecall();
		
		//
		
		iPhone iPhonex = new iPhone();
		iPhonex.name = "Iphonex latest";
		System.out.println("this is my phone version number" + " " + iPhonex.name);
		iPhonex.contact();
		iPhonex.phoneMessaging();
		iPhonex.recording();
		iPhonex.video();
		iPhonex.phonecall();
		
	}

}
