
public class UserManager {

	public void Add(User user) {
		System.out.println(user.getFirstName() + " Adli Kullanici eklendi");
	}
	
	public void Update(User user) {
		System.out.println(user.getFirstName() +" Adli Kullanici bilgileri guncellendi");
	}
	
	public void Delete(User user) {
		System.out.println(user.getFirstName() +" Adli Kullanici silindi");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			Add(user);		
		}
	}

	public void Add(Student student) {
		// TODO Auto-generated method stub
		
	}
}
