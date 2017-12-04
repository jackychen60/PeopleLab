
public class Classroom {
	
	private Person[] Student;
	private Person Teacher;
	
	public Classroom(Person[] Student, Person Teacher) {
		// TODO Auto-generated constructor stub
		this.Student=Student;
		this.Teacher=Teacher;
	}
	
	public String getSubject() {
		return getSubject();
	}
	
	public double classAverage() {
		double total = 0.0;
		int numStudents = 0;
		for(Person A : this.Student) {
			if(A instanceof Student)
			{
				total+=((Student) A).getGPA();
				numStudents++;
			}
		}
		return total/numStudents;
	}
	
	public String printClass() {
		return  Teacher + " " + getSubject() + Student;
	}

}
