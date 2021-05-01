
public class StudentManager extends UserManager {

	
	
	public void Add(Student student) {
		System.out.println(student.getFirstName() + " Adli Ogrenci " + student.getCourseName() + " kursuna kayit oldu");
	}
	
	
	public void Update(Student student) {
		System.out.println(student.getFirstName() +" Adli Ogrenci bilgileri guncellendi");
	}
	
	
	public void Delete(Student student) {
		System.out.println(student.getFirstName() +" Adli Ogrenci silindi");
	}
}
