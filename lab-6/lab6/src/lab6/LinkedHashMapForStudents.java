package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;

import java.util.Map;

public class LinkedHashMapForStudents {

	private LinkedHashMap<String, StudentDetails> studentsHashMap = new LinkedHashMap<String, StudentDetails>();
	private ArrayList<StudentDetails> listOfStudents;
	
	public void InsertStudentInLinkedHashMap()
	{
		PopulateListWithStudents populateList = new PopulateListWithStudents();
    	listOfStudents = populateList.getAListOfStudents();
    	
		studentsHashMap.put("1961102080011", listOfStudents.get(0));
		studentsHashMap.put("1961102080012", listOfStudents.get(1));
		studentsHashMap.put("1961102080013", listOfStudents.get(2));
		studentsHashMap.put("1961102080014", listOfStudents.get(3));
		studentsHashMap.put("1961102080015", listOfStudents.get(4));
		studentsHashMap.put("1961102080016", listOfStudents.get(5));
		studentsHashMap.put("1961102080017", listOfStudents.get(6));
		studentsHashMap.put("1961102080018", listOfStudents.get(7));
		studentsHashMap.put("1961102080019", listOfStudents.get(8));
		studentsHashMap.put("1961102080020", listOfStudents.get(9));	
				
	}
	
	public void PrintAllEllements()
	{				
		for (Map.Entry<String, StudentDetails> s: studentsHashMap.entrySet())
	       { 
	           System.out.println("The CNP " + s.getKey() + " belongs to the student: " 
	                                         + s.getValue().nume + " " + s.getValue().prenume
	        		                         + " " + "which has the following grades: "); 
	           System.out.println(" -> Lb. romana: " + Arrays.toString(s.getValue().noteLibRomana));
	           System.out.println(" -> Lb. romana: " + Arrays.toString(s.getValue().noteMatematica));
	       }
	}
	
	
	public void InsertTheSameCnpWithDifferentValues()
	{
		StudentDetails studentTest = new StudentDetails("Test", "Catalin", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		studentsHashMap.put("1961102080011", studentTest);
		
		//daca inseram un element cu acelasi key dar valori diferinte, in map acesta va suprascrie elementul vechi care avea key-ul respectiv
		//in acest caz inlocuieste primul element cu noile valori 
	}
}
