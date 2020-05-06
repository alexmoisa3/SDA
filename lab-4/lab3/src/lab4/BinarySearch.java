package lab4;

public class BinarySearch {
	
	public boolean binarySearch(int sortedArray[], int x)
	{
		int n=sortedArray.length;
		int left=0;
		int right=n-1;
		
		while (left <= right) 
		{
		   int mid = (right+left) / 2;
		   
		   
		   if (sortedArray[mid] == x) {
	            return true;
	        }
		   
		   else if (sortedArray[mid] < x) {
		            left = mid + 1;
		    } 
		   else if (sortedArray[mid] > x)
		   {
		            right = mid - 1;
		   } 
		}
		   
		   return false;
  
	}

}

