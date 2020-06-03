package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapForStudents {
   
	private HashMap<String, StudentDetails> studentsHashMap = new HashMap<String, StudentDetails>();
	
	private ArrayList<StudentDetails> listOfStudents;//
	
	private ArrayList<String> orderOfCnpInserted = new ArrayList<String>(); 
	
    public void InsertStudentInHashMap()
    {
       	
    	PopulateListWithStudents populateList = new PopulateListWithStudents();
    	listOfStudents = populateList.getAListOfStudents();
    	    	
    	orderOfCnpInserted.add("1961102080011");
		orderOfCnpInserted.add("1961102080012");
		orderOfCnpInserted.add("1961102080013");
		orderOfCnpInserted.add("1961102080014");
		orderOfCnpInserted.add("1961102080015");
		orderOfCnpInserted.add("1961102080016");
		orderOfCnpInserted.add("1961102080017");
		orderOfCnpInserted.add("1961102080018");
		orderOfCnpInserted.add("1961102080019");
		orderOfCnpInserted.add("1961102080020");
    	   	
    	for(int i=0; i<10; i++)
    	{
    		studentsHashMap.put(orderOfCnpInserted.get(i), listOfStudents.get(i));
    	}			   	
    }
    
    
    
    public void SearchForStudentByCNP(String CNP)
    {
    	StudentDetails foundStudent = studentsHashMap.get(CNP);
    	
    	System.out.print("Nume: ");
    	System.out.println(foundStudent.nume);
    	
    	System.out.print("Prenume: ");
    	System.out.println(foundStudent.prenume);
    	
    	System.out.print("Note limba romana: ");
    	System.out.println(Arrays.toString(foundStudent.noteLibRomana));
    	
    	System.out.print("Note matematica: "); 	
    	System.out.println(Arrays.toString(foundStudent.noteMatematica));
    }
    
    public void GetAllCNPValuesFromHashTable()
    {
    	Set<String> keys = studentsHashMap.keySet();
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println();
    }
    
    public boolean CheckOrderOfKeys()
    {  
    	int i=0; 
    	boolean ok=true;
    	
    	for (Map.Entry<String, StudentDetails> s: studentsHashMap.entrySet()) 
	    { 
	       if(s.getKey() != orderOfCnpInserted.get(i));
	       {	    	 
	    	   ok=false;
	    	   return ok;
	       }
	    }
	       
	   return ok;
	    
    }
}
