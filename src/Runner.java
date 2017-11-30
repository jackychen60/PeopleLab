
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
		Classroom x = new Classroom(Avg, Sub);
		System.out.println(x.getSubject() + x.classAverage());
	}
}
