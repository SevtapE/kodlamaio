package kodlamaio;

public class InstructorManager extends UserManager {
	public void addCourse() {
		System.out.println("Yeni kurs eklediniz..");
		
	}
	@Override
	public void add(User user) {
		System.out.println("Kendi kurallarýyla instructor eklendi");
		
	}
}
