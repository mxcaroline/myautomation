package JavaExercise;

/* Data type
 * Variable
 * Operators
 * Arrays
 * Class and Method
 * Control Statements
 * Loops
 * 
 * 
 * 
 dataype dattsadsgsaiudasduasg
 * 
 * 
 * 
 * 
 */
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		//Datatypes
		
		//String, boolean, int, float, double,
         //to declare a variable, you need to write out "Datatype" and "variablename";
	     String  sEmployeename; //these are letters
	     int age;
	     String sCategory;
	     float fSalary;
	     double NI;
	     char W; // holds only one letter, uses only single quotation marks
	     boolean Staff = true;
	     
	     int a = 5;
	     int b = 3;
	     int answer ;
	     
	     
	     //to assign a value to a variable "name of variable" then equate it to the respective value. Note you print the variable name
	     sEmployeename = "Jenifer";
	     System.out.println("This is the current Employee name" + "   " + sEmployeename);// this is used to print out statements in java
	     sCategory = "Information Technology";
	     System.out.println("This is the school category" + sCategory);
	     age = 35;// int are numbers, they are numbers that can be calculated
	     System.out.println("This is the declared age" + age);
	     fSalary = 500.00f;
	     System.out.println("This is the staff salary" + fSalary);
	     NI = 23.15;
	     System.out.println("This is the NI calculation" + NI);
	     W = 'p';
	     System.out.println("This is the code" + W); 
	     System.out.println("This is a staff member" + Staff);
	     
	     
	     // this is an operator example
	     
	     answer = a+b;
	     System.out.println("This is the sum of a and b" + "  " + answer);
	     
	     // "=" assignment operator is used to assign values to a variable. always assign value from right to left
	     // "+" ++  this is used to add
	     // "*"  this is used to multiply
	     // "/" this is used to divide
	     // "%" this is used for
	     // - , --
	     
	     answer = a * b;
	     System.out.println("This is the multiplication of a and b" + "  " + answer);
	     answer = a/b;
	     System.out.println("This is the division of a and b" + "  " + answer);
	     answer = a-b;
	     System.out.println("This is the subtraction of a and b" + "  " + answer);
	     answer = a%b;
	     System.out.println("This is the percentage of a and b" + "  " + answer);
	
	      
	     
	     // Relational Operators 
	     /*
	      *  they are used to determined the comparison between  two or more objects . they always return boolean value eaither true or flase 
	        we six Greater than > this check if the value of left  operand  is greater than the right a > b
	        less than <   check if the left operand is lesser than right  a < b = true or false 
	        greater than or equal to >= this is to validate if the value on the left is greater or equal to the value on the right
	        lees than or equal to <= this is to validate if the value on the left is less than or equal to the value on the right 
	      * 
	      * Equal ==  if both values are equal then its true (values must be equal), else its false
	      * Not Equal !=   a!=
	      * 
	      * >
	      * <
	      * >=
	      * <=
	      * !=
	      * ==
	      * 
	      * 
	      * 
	      */
	     
	     int testValue = 37;
	    //first test for greater than
         System.out.println(" check age" + ( age > testValue)); // false
         //test for the less than operator
	     System.out.println(" testing age " +  " " + (age < testValue)); //true 
	     //test for >= operator
	     System.out.println("test for age" + " " + (age >= testValue)); //false
	     
	     int loan = 500;
	     int earning = 500;
	     //  test to see what user earns 
	     System.out.println("test earning is more than 500" + " " + (earning <= loan));
	     // testing equal equal ==
	     System.out.println("test to validate loan and earning" + " " + (earning == loan));
	     // testing not equal
	     System.out.println("testing the not equal value" + " " + (earning != loan));
	     // this person should not get  loan
	     
	     /* logical operators  returns a true or false value based  on the state of teh variables. each arguament to a logical operators must be a boolean
	      * 
	      * 
	      * we have 
	      * And operator  &&  this retuns true if the output of both  values under test are true 
	      * OR Operator  || this return true if the out  put of either values are trues 
	      * Not  Opertor !
	      * 
	      * 
	      */
	     boolean sports = true;
	     boolean music = false;
	     
	     System.out.println("test for the student admission" + " " + (sports && music)); // both values must be true for this student to be admitted
	     System.out.println("testing for the alternative options" + " " + (sports || music)); //values could vary
	     System.out.println("testing student is not eligible" + " " + (!music));
	  
	
	}

}
