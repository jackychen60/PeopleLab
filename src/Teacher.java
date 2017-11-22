
public class Teacher extends Person{
	
	private String Subject;
	private String Title;
	
	public Teacher(String Subject, String Title, String FirstName, String FamilyName, double ShoeSize, int Age) {
		// TODO Auto-generated constructor stub
		super(FirstName,FamilyName,ShoeSize,Age);
		this.Subject=Subject;
		this.Title=Title;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	public String toString() {
		return getTitle() + "." + getFamilyName();
	}

}
