
public class Classroom {
	
	private Student[] Student;
	private Person Teacher;
	
	public Classroom(Student[] Student, Person Teacher) {
		// TODO Auto-generated constructor stub
		this.Student=Student;
		this.Teacher=Teacher;
	}
	
	public String getSubject() {
		return getSubject();
	}
	
	public double classAverage() {
		double x = 0;
		for(int i=0;i<Student.length;i++) {
			x = x + Student[i].getGPA();
		}
		x = x / Student.length;
		return x;
	}
	
	public String printClass() {
		return  Teacher + " " + getSubject() + Student;
	}

}
