package lab4;

public class RemoveNumberEx2 {
    public int[] removeX(int n, int arr[], int x, int pos) 
	    { 
	        int i; 
	  
	      
	        int newarr[] = new int[n-1];
	  
	     
	        for (i = 0; i < pos; i++) 
	            newarr[i] = arr[i]; 
	       
	  
	       // newarr[pos] = x;
	        
	        for (i = pos; i < n-1; i++) 
	  
	            newarr[i] = arr[i+1]; 
	      
	      
	  
	        return newarr; 
	    } 

}
