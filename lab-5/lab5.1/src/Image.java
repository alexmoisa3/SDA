import java.util.Random;

public class Image {
		
	private int[][] image;
	private int[][] borderedMatrix;
	private int resultsMatrix[][];
	
    public void GenerateOriginalImage(int n, int m)
    {
    	image = new int[n][m];
    	
    	Random rand = new Random();
	
	    for(int i=0; i<n;i++)
	    {
		  for(int j=0; j<m; j++)
		  {
		      image[i][j] = rand.nextInt(255);		
		  }
	    }
	
	
	    for(int i=0; i<n;i++)
	    {
		  for(int j=0; j<m; j++)
		  {
		      System.out.print(image[i][j] + " ");
		  }	
		  
		  System.out.println();
	    }
    }
	
      
    public void addZeroBorderToImage()
    {	 
    	borderedMatrix  = new int[image.length+2][image[0].length+2];
        resultsMatrix = new int[image.length+2][image[0].length+2];
    	
    	for(int i=0; i<borderedMatrix.length; i++)
    	{
    		for(int j=0; j< borderedMatrix[0].length; j++)
    		{
    			borderedMatrix[i][j]=0;
    		}
    	}
    	  	
    	for(int k=0; k<image.length; k++)
    	{
    		for(int l=0; l<image[0].length; l++)
    		{
    			borderedMatrix[k+1][l+1] = image[k][l];
    		}
    	}		     	    	 
    }
    
   
	public void ProcessImage()
	{  		
		addZeroBorderToImage();
		
		for(int i=1; i< image.length+1; i++)
			for(int j=1; j< image[0].length+1; j++) 
			{  		
				int sum = borderedMatrix[i-1][j-1] + borderedMatrix[i-1][j] + borderedMatrix[i-1][j+1]
						+ borderedMatrix[i][j-1]   + borderedMatrix[i][j]   + borderedMatrix[i][j+1]
						+ borderedMatrix[i+1][j-1] + borderedMatrix[i+1][j] + borderedMatrix[i+1][j+1];
				
			    float result= (float)sum/9;
				   	   
				resultsMatrix[i][j] = Math.round(result);
				    
	         }		    			
	 }


  public void PrintFilteredImage(int n, int m)
  {
	int [][] filteredMatrix = new int [n][m];
	
	 for(int i=1; i<=n; i++)
	 {
		 for(int j=1; j<= m; j++)
		 {		 
		     filteredMatrix[i-1][j-1] = resultsMatrix[i][j];					 				 
		 }
	 }
	 
	 for(int x=0; x<n ;x++)
	 {
	     for(int y=0; y<m; y++)
	  	 {
	  		 System.out.print(filteredMatrix[x][y] + " ");
	     }
	     
	    System.out.println();  	
	 }	 
  }
}
	
	
	
  

