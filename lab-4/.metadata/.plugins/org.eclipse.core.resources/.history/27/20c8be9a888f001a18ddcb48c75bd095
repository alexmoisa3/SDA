package lab4;

import java.io.*; 
import java.lang.*; 
import java.util.*; 
import java.util.Scanner;
  

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumberEx1 add=new AddNumberEx1();
		RemoveNumberEx2 remove=new RemoveNumberEx2();
		
		
		    int n = 10; 
	        int newarr[];
	        int newarr2[];
	        
	             
	        // initial array of size 10 
	        int arr[] 
	            = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9}; 
	        
	        // print the original array 
	        System.out.println("Initial Array:\n"
	                           + Arrays.toString(arr)); 
	              
	       
	        
	        Scanner console = new Scanner(System.in);
	        System.out.println("Intoduceti pozitia: ");
	        int pos = console.nextInt();
	 
	  
	        // element to be added 
	        int x = 100; 
	  
	        // call the method to add x in arr 
	        newarr = add.addX(n, arr, x,pos); 
	  
	        // print the updated array 
	        System.out.println("\nArray with " + x 
	                           + " added:\n"
	                           + Arrays.toString(newarr)); 
	        
	        
	        
	        Scanner console2 = new Scanner(System.in);
	        System.out.println("Intoduceti pozitia: ");
	        int pos2 = console.nextInt();
	        
	        
	        newarr2=remove.removeX(n, arr, x,pos2);
	        
	        		 System.out.println("\nArray with number on the inserted position" 
	                           + " removed:\n"
	                           + Arrays.toString(newarr2)); 
	        
	        		 
	        		 
	       System.out.println(); 
	       BinarySearch search=new BinarySearch();	 
	       int sortedArray[] = { 0, 1, 2, 3, 5, 10, 12, 25, 40, 45, 50};
	       System.out.println("Initial Array:\n"
                   + Arrays.toString(sortedArray)); 

	     //Caz1
	       int numberToSearch1=2;
	       System.out.print(" -> Case1: Testing the binary search for a number positioned in the left side of the array, on position: ");
	       System.out.println(numberToSearch1);
	       
	       boolean resultOfBinarySearch1= search.binarySearch(sortedArray, numberToSearch1);
	       if(resultOfBinarySearch1 == true)
	    	   System.out.printf("%54s \n", "The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	       
	       
	       //caz2
	       int numberToSearch2=3;
	       System.out.print(" -> Case2: Testing the binary search for a number positioned in the left side of the array, on position: ");
	       System.out.println(numberToSearch2);
	       
	       boolean resultOfBinarySearch2 = search.binarySearch(sortedArray, numberToSearch2);
	       if(resultOfBinarySearch2 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	       
	       //caz3
	       int numberToSearch3=12;
	       System.out.print(" -> Case3: Testing the binary search for a number positioned in the right side of the array, on position: ");
	       System.out.println(numberToSearch3);
	       
	       boolean resultOfBinarySearch3 = search.binarySearch(sortedArray, numberToSearch3);
	       if(resultOfBinarySearch3 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	       
	       //caz4
	       int numberToSearch4=25;
	       System.out.print(" -> Case4: Testing the binary search for a number positioned in the right side of the array, on position: ");
	       System.out.println(numberToSearch4);
	       
	       boolean resultOfBinarySearch4 = search.binarySearch(sortedArray, numberToSearch4);
	       if(resultOfBinarySearch4 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	    	   
	       
	       
	       //caz5
	       int numberToSearch5=10;
	       System.out.print(" -> Case5: Testing the binary search for a number positioned in the middle of the array: ");
	       System.out.println(numberToSearch5);
	       
	       boolean resultOfBinarySearch5 = search.binarySearch(sortedArray, numberToSearch5);
	       if(resultOfBinarySearch5 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	    	   
	       
	       //caz6
	       int numberToSearch6=0;
	       System.out.print(" -> Case6: Testing the binary search for the first number in the array: ");
	       System.out.println(numberToSearch6);
	       
	       boolean resultOfBinarySearch6 = search.binarySearch(sortedArray, numberToSearch6);
	       if(resultOfBinarySearch6 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	       
	       //caz7
	       int numberToSearch7=50;
	       System.out.print(" -> Case7: Testing the binary search for the last number in the array: ");
	       System.out.println(numberToSearch7);
	       
	       boolean resultOfBinarySearch7 = search.binarySearch(sortedArray, numberToSearch7);
	       if(resultOfBinarySearch7 == true)
	    	   System.out.printf("%54s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%54s \n","The number you searched does not exist in the array");
	       
	       //caz8
	       int numberToSearch8=53;
	       System.out.print(" -> Case8: Testing the binary search for a number that does not exist in the array: ");
	       System.out.println(numberToSearch8);
	       
	       boolean resultOfBinarySearch8 = search.binarySearch(sortedArray, numberToSearch8);
	       if(resultOfBinarySearch8 == true)
	    	   System.out.printf("%62s \n","The number you searched exists in the array");	   		
	       else
	    	   System.out.printf("%62s \n","The number you searched does not exist in the array");
	       
	       

	}

}
