
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"ezgi", "aydin");
		User user2 = new User(2,"samiha", "ay");
		User user3 = new User(3,"kerim", "gul");
		User user4 = new User(4,"sinem", "kaya");
		
		Student student1 = new Student(5,"ahmet", "aylin");
		student1.setCourseName("C++");
		Student student2 = new Student(6,"pinar", "sel");
		student2.setCourseName("Java");
		
		Instructor instructor1 = new Instructor(7,"Yasemin","Peri");
		instructor1.setProfession("C#");
		
		System.out.println(instructor1.getProfession());
		System.out.println(user1.getFirstName());
		
		
		
		User[] users = {user1,user2,user3,user4};
		UserManager userManager = new UserManager();
		
		Student[] students= {student1,student1};
		StudentManager studentManager = new StudentManager();
		
		InstructorManager instructorManager=new InstructorManager();
		
		studentManager.Add(student2);
		studentManager.Update(student1);
		studentManager.Delete(student2);
		instructorManager.Add(instructor1);
		userManager.addMultiple(students);
		userManager.addMultiple(users);
		
		

	}

}
