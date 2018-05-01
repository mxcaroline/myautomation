package JavaExercise;

public class Controlstatement {

	public static void main(String[] args ) {
		
		/*
		 *  decision making is one of the critical factor in programming 
		 * two types of decision making statement  
		 * IF STATEMENT 
		 * switch statement 
		 * 
		 * using IF STATEMENT , eg for student to be admitted you should able to play a sport or music or both if not no adminssion 
		 * if(student play sport )
		 * {
		 *     statement 
		 * }
		 *
		 * 
		 * 
		 */
		
		String admission = "eligible";
		String sportname = "tennis"; 
		String music = "hiphop";
		
		// student  must be playing tennis and know hiphop music admission ... criteria '&&' = and '||' = or for comparing
		if (sportname.equals("tennis") ||  music.equals("afro")) 
		{
			System.out.println(" student is ...." + "  " + admission );
		}
		else {
			
			 System.out.println("Re  take exam next season ......");
		}

		//test for location and risk of a person to determine the type of insurance they pay 
		String location = "mayfair";
		String risk = "low";
		String insurancetype = "premium";
		
		if( location.equals("mayfair")){
			System.out.println("your are eligible to be insured on" + " " + insurancetype  + " and your risk level is "  + " " + risk);
		}
		else {
			System.out.println("you are not qualified");
		}
		
		// Write a new if else statement e.g breakfast menu 
	
		
		String breakfast = "egg";
		String lunch = "rice";
		String dinner = "soup";
		
		//if  
		 if( breakfast.equals("egg")) {
			System.out.println("you love" + " " + breakfast); 
		 }
		 else {
			 System.out.println("you are not eating today");
		 }	
			
		 if( lunch.equals("rice")) {
			System.out.println("you are having lunch"); 
		 }
		 else {
			 System.out.println("no lunch for you");
		 }
		 
		 if( dinner.equals("soup")) {
				System.out.println("you are having dinner"); 
			 }
			 else {
				 System.out.println("no dinner for you");
			 }	 
	}
	
}
		 
	
	

				 
	
		

		 
			 
		 
