
public class Runner {
	static String[] firstNames; 
	static String[] familyNames;


	public static void main(String[] args)
	{
		String teacher = "Mr.Levin";
		Person[] students = {"Jacky", "Vivian", "MAMADOU"};

		for (String Student : students) {
			System.out.println(Student);
			
		}
		System.out.println(Classroom.getSubject() + Classroom.classAverage());
	}
}
