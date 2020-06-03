package lab6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		//HashMap
		
		 HashMapForStudents hashMap = new HashMapForStudents();
		 hashMap.InsertStudentInHashMap();//apelez metodele
		 
		 Scanner console = new Scanner(System.in);
	     System.out.println("Insert CNP: ");
	     String studentCNP = console.nextLine();
		 
		 hashMap.SearchForStudentByCNP(studentCNP);
		 
	     System.out.println();
		 System.out.println("All CNP values inserted: ");
		 hashMap.GetAllCNPValuesFromHashTable();
		 
		 System.out.println("Checking the order of the keys: ");
		 boolean result = hashMap.CheckOrderOfKeys();
		 if(result == false)
		     System.out.println("The order of the keys is not the same as the one inserted");
		 else
			 System.out.println("The order of the keys is the same as the one inserted");
		System.out.println();
		
		//LinkedHashMap
		
		System.out.println("These are all the elements inserted in the LinkedHashMap: ");
		LinkedHashMapForStudents linkedHashMap = new LinkedHashMapForStudents();
		linkedHashMap.InsertStudentInLinkedHashMap();
		linkedHashMap.PrintAllEllements();
		
		System.out.println();
		System.out.println("These are all the elements in the LinkedHashMap after inserting one element with the same key but different values: ");
		linkedHashMap.InsertTheSameCnpWithDifferentValues();
		linkedHashMap.PrintAllEllements();
	}

}
