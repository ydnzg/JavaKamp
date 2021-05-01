
public class InstructorManager extends UserManager {

	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Adli Egitmen eklendi");
	}
	
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" Adli Egitmen bilgileri guncellendi");
	}
	
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" Adli Egitmen silindi");
	}
}
