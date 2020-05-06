package lab3;

public class HexColorValidator {
	Boolean validate(String colorHex ) {
		
		Boolean ok=true;	
	
	
	
			if(colorHex.charAt(0)!='#')
			{
				ok=false;
				throw new IllegalArgumentException("The Hex color you provided is not valid: no # found!");	
				
		   }
			
		
			if(colorHex.length()>7)
			{
				ok=false;
				throw new IllegalArgumentException("The Hex color you provided is not valid: The number of characters is not 7");	
				
		   }
			
			int i=1;
			while(i<7)
				
			{
				if(colorHex.charAt(i)<'a' && colorHex.charAt(i)<'0'  ||  colorHex.charAt(i)>'f' && colorHex.charAt(i)>'9')
				{
					ok=false;
					throw new IllegalArgumentException("The Hex color you provided is not valid: Only digits and characters between a and f are accepted");
				}
				
				
					i++;
					
			}
				
										
		  
			return ok;
			
	}
}
