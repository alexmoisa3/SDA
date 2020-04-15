package lab3;

public class HexColorValidator {
	Boolean validate(String colorHex ) {
		
		Boolean ok=true;	
		//int numberOfCharacters=0;
	
	
			if(colorHex.charAt(0)!='#')
			{
				ok=false;
				throw new IllegalArgumentException("The Hex color you provided is not valid: no # found!");	
				
		   }
			
			//int j=1;
			
		//  do {
			 //  numberOfCharacters++;
			  // colorHex.substring(1, colorHex.length()-1);
			  // j++;
			   
		  // }while(colorHex.charAt(j)!='#');
		
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