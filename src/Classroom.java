
public class Classroom {
	
	private Student[] student;
	private Person teacher;
	
	public Classroom() {
		// TODO Auto-generated constructor stub
		this.student=student;
		this.teacher=teacher;
	}
	
	public String getSubject() {
		return getSubject();
	}
	
	public double classAverage() {
		double x = 0;
		for(int i=0;i<student.length;i++) {
			x = x + student[i].getGPA();
		}
		x = x / student.length;
		return x;
	}
	
	public String printClass() {
		return Teacher.getTitle() + teacher + " " + getSubject() + student;
	}
}
