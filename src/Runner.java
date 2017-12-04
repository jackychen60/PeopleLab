
public class Runner {
	static String[] firstNames; 
	static String[] familyNames;


	public static void main(String[] args)
	{
		Person teacher = new Teacher("AP Java","Mr.", "Nathan", "Levin", 10, 29);
		Person[] students = new Student{(4.0, 1380, 7, "Vivian", "Yee", 7, 17),(4.0, 1380, 7, "Vivian", "Yee", 7, 17)};

		for (Person Student : students) {
			System.out.println(Student);
			
		}
		Classroom x = new Classroom(students,teacher);
		System.out.println(x.getSubject() + x.classAverage());
	}
}
