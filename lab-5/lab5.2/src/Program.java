import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {5,8,2,3,4,1,6};

	    System.out.println("Initial Array:\n" + Arrays.toString(arr)); 
     	
		Sort sort = new Sort();
		sort.QuickSort(0,6,arr);
		
		System.out.print("Sorted Array:\n" + Arrays.toString(arr)); 
	}

}
