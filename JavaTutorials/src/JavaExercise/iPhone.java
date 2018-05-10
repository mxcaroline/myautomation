package JavaExercise;
/*
 * in object oreinted programming (oop) an object is an instance of a class
 * An object can be considered as a thing which performs a set of activities 
 * , an object can be anything and in real world an object can be a car, employee 
 * 
 * object share two characteristic they  have a state and behavour 
 * scenerio A class/ blue print or a template of an object (CAR) 
 state in car would be (Brake, Steering, Brand name, Color, Windscreen)
 Behavior/Function/Method (Drive, Steering, Accelerate, Brake, Seat, Speed )
 * 
 * Scenario B Employee (Name, Age, Department, Address, sex, ID, )
 * Behavior/Action/Function/ method  (Execute a task, Belong to a department, Working hours) 
 *task()
 *department()
 *
 *
 *Scenario C House (Live, Address, Color, doors, Size, Rooms, Kitchen)
 *Method/Behavior 
 *Cook()
 *Host()
 *Size()
 *Room()
 *garage()
 *
 *Scenario D iPhone (Model, Colour, Size, Version, Software)
 *Method/Behavior
 *Phonecall()
 *Contact()
 *Messaging()
 *Recording()
 *Video()
 *Connectivity()
 *
 *What is a class in Java - classes are templates or blueprints for the creation of objects. They have the same rules guiding them
 *All the objects created from a class can share the same data types (characteristics) and behavior. The difference btw class and objects are 
 *classes are created when the program is created
 *Objects are created during the programming run time  
 *
 *iphone  iphone7, iphone8,  ;
 *
 *iphone7.video(yes);
 *iphoene7.messaging()
 * 
 * 
 * 
 * 
 */
public class iPhone {// "{}"this is called curly braces of a class its referred to its body. Anything declared inside the curly braces are called members of the class. 
	// you declare your variables or field in this curly brace
	
	//name 
	String name;
	//version
	int versionnumber;
	//Model
	String model;
	//colour
	String color;
	
      
	public void phonecall() {
		System.out.println("This is a test call");
	}
	
	public void contact() {
		System.out.println("My contact list");
	}
	
	public void phoneMessaging(){// camo casing 
		System.out.println("This is a phone message");
	}
	
	public void recording() {
		System.out.println("This is to be recorded");
	}
	
	public void video() {
		System.out.println("This is my video");
	}
	
}

