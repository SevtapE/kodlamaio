package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Instructor ayse=new Instructor();
		Student yesim=new Student();
		
		UserManager manager=new UserManager();
		manager.add(yesim);
		manager.add(ayse);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse();
	    instructorManager.add(yesim);
		StudentManager studentManager=new StudentManager();
		studentManager.registerCourse();
		
		System.out.println("UserManager array");
		UserManager[] userManagers=new UserManager[] {new InstructorManager(),new StudentManager()};
		
		for(UserManager userManager:userManagers) {
			userManager.add(new User());
		}
	}

}
