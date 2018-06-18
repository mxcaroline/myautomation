package JavaExercise;

public class Arrays {
      
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		 //  array is used to store multiple data of same datatypes 
		// how to declare an array: dataType variable_name[] = {values_of_the_array};
		
		String  Employee[] = {"John","Ann","Ken", "Mark", "Lizzy", "jane", "mary", "anthony"}; //ITS INDEX ARRAY start from 0 to any number 
		String Food[] = {"Bread", "Rice", "Yam", "Egg", "Plantain"};
		String Places[] = {"Canary Wharf", "Barking", "knights Bridge", "Chelsea", "Swiss Cottage"};
		int Salary[] = {2000, 5000, 10000, 12000, 18000, 20000};
		
	// to get a value out of an array[], eg Employee[0] = john 
		System.out.println("the value of the first number in employer array is " + " " + (Employee[0]));
		System.out.println("The value of the second employer" + " " + (Employee[1]));
		System.out.println("the third value of the employer is" + " " + (Employee[2]));
		System.out.println("This is the fourth employer called" + " " + (Employee[3]));
		System.out.println("This is the fifth employer called" + " " + (Employee[4]));
		
	// to get the length of an array is create a an int variable = Employee[].length
		
		int num_of_employee = Employee.length; // this count the values inside your  array 
		System.out.println("This is the number of employees" + " " + num_of_employee);
		
		int numofplaces = Places.length;
		System.out.println("This is the number of places" + " " + numofplaces);
		
	      // for loop takes 3 values for(initiation , iteration, incremental)
		 for( int b =0; b <=Places.length-1; b++ ){
			 System.out.println("the value of my places is >>>>>" + Places[b]);
		 }
		 
		 // example loop for salary 
		 for(int caroline=0; caroline <=Salary.length-1; caroline++) {
			 System.out.println("list of salary>>>>" + Salary[caroline]);
		 }
		 
	}
	
	
	
}

