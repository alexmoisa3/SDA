package lab3;

public interface Shape {
	
	void Draw();
	double getArea();
	String getName();
	String getHexFillColor();
	int getBorderWidth();
	
	
	/*static void draw(int n) {
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i==0 || j==0 || i==n || j==n) {
				System.out.println("*");
				}
				else {
					System.out.println(" ");
				}
				
		
	}
	static double getArea(double size)	{
		return size;
	}*/

}