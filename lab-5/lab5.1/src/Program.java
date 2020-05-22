import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner console1 = new Scanner(System.in);
	    System.out.println("n= ");
	    int n = console1.nextInt();
		
	    Scanner console2 = new Scanner(System.in);
	    System.out.println("m= ");
	    int m = console2.nextInt();	
	    
	    Image img = new Image();
		img.GenerateOriginalImage(n,m);
		//img.addZeroBorderToImage();
		img.ProcessImage();
		System.out.println();
		img.PrintFilteredImage(n,m);
		

	}

}
