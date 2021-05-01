
public class Instructor extends User{

	private String profession;
	
	public Instructor(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
