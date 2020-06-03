package lab6;

import java.util.ArrayList;
import java.util.List;

public class PopulateListWithStudents {

	private ArrayList<StudentDetails> listOfStudents = new ArrayList<StudentDetails>();
	
	public ArrayList<StudentDetails> getAListOfStudents()
	{
		StudentDetails student1 = new StudentDetails("Moisa", "Alexandru", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student2 = new StudentDetails("Moisa", "Alexandru1", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student3 = new StudentDetails("Moisa", "Alexandru2", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student4 = new StudentDetails("Moisa", "Alexandru3", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student5 = new StudentDetails("Moisa", "Alexandru4", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student6 = new StudentDetails("Moisa", "Alexandru5", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student7 = new StudentDetails("Moisa", "Alexandru6", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student8 = new StudentDetails("Moisa", "Alexandru7", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student9 = new StudentDetails("Moisa", "Alexandru8", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student10 = new StudentDetails("Moisa", "Alexandru9", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);
		listOfStudents.add(student5);
		listOfStudents.add(student6);
		listOfStudents.add(student7);
		listOfStudents.add(student8);
		listOfStudents.add(student9);
		listOfStudents.add(student10);
		
		return listOfStudents;
	}
}
