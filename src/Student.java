/**
 * 
 */

/**
 * @author BT_1N3_07
 *
 */
public class Student extends Person {
	private double GPA;
	private int SAT;
	private int Classes;
	/**
	 * 
	 */
	public Student(double GPA, int sat, int classes, String FirstName, String FamilyName, double ShoeSize, int Age) {
		// TODO Auto-generated constructor stub
		super(FirstName,FamilyName,ShoeSize,Age);
		this.Classes=classes;
		this.GPA=GPA;
		this.SAT=sat;
	}
	
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getSAT() {
		return SAT;
	}
	public void setSAT(int sAT) {
		SAT = sAT;
	}
	public int getClasses() {
		return Classes;
	}
	public void setClasses(int classes) {
		Classes = classes;
	}
	
	public String toString() {
		return getFamilyName() + "," + getFirstName();
	}
}

