
public abstract class Person {
	private String FirstName;
	private String FamilyName;
	private double ShoeSize;
	private int Age;
	
	public Person(String FirstName, String FamilyName, double ShoeSize, int Age) {
		// TODO Auto-generated constructor stub
		this.FirstName = FirstName;
		this.FamilyName = FamilyName;
		this.ShoeSize = ShoeSize;
		this.Age = Age;
	}
	
	public String getFamilyName() {
		return FamilyName;
	}
	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}
	public double getShoeSize() {
		return ShoeSize;
	}
	public void setShoeSize(double shoeSize) {
		ShoeSize = shoeSize;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public abstract String toString();
}
