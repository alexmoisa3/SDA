
import java.util.Arrays;

public class Sort {
	
	public int part(int arr[], int l, int r)
	{
		int i,j,aux,pivot;
		i=l;
		j=r;
		
		pivot=arr[l];
		
		do
	     {                 
	        while (pivot < arr[j])
	        {
	              j --;
	        } 
	         while (pivot >arr[i])
	         {
	              i++;
	         } 
	          if (i < j)
	         { 
	                 aux = arr[i];    
	                 arr[i] = arr[j];
	                 arr[j] = aux;
	         }
	     }while (i < j);  
		
	     return j; 		
	}
	
	public void QuickSort(int l, int r, int arr[])
	{
		int middle;
		if(l<r)
		{
			middle=part(arr,l,r);
			QuickSort(l,middle,arr);
			QuickSort(middle+1,r,arr);
		}
	}
}
