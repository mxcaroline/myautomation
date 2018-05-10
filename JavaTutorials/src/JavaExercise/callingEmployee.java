package JavaExercise;

public class callingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		
		emp.address = "london";
		System.out.println("employee address" + " " + emp.address);
		
		emp.age = 37;
		System.out.println("employee age" + " " + emp.age);
		
		emp.ID = 1007;
		System.out.println("employee ID" + " " + emp.ID);
		
		emp.name = "Susan Baker";
		System.out.println("employee name" + " " + emp.name);
		
		emp.salary ="£2000";
		System.out.println("employee salary" + " " + emp.salary);
		
		emp.sex = "Female";
		System.out.println("employee sex" + " " + emp.sex);
		
		emp.performance();
		emp.skill();
		emp.job();
		emp.timeofwork();
		
		
	}

}
