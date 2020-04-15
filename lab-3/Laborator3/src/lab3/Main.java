package lab3;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<>();
		shapes.add( new Square("#a09542", 2, 10));
		shapes.add( new Rectangle("#f5f6f5", 2, 5, 7));
		shapes.add( new Circle("#f5f6f5", 2, 5));	

		
		
		
		for(Shape s: shapes)
		{
						
			System.out.println("Name of the shape: ");			
			System.out.println(s.getName());
			
			System.out.println("Area of the shape: ");	
			System.out.println(s.getArea());
			
			System.out.println("Border width: ");	
			System.out.println(s.getBorderWidth());
			
			System.out.println("Hex color: ");	
			System.out.println(s.getHexFillColor());
			
			System.out.println();
			s.Draw();
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}