
public class Reverse{

public static void main(String...s){	
	
       try        {
    	   int a[]= {1, 2, 3, 4};            
    	   for (int i = 1; i <= 3; i++){                
    		   System.out.println ("a[" + i + "]=" + a[i] + "n");            
    		   }        
    	   }   

       
       catch(Exception e){            
    	   System.out.println ("error = " + e);        
    	   }  
       catch (ArrayIndexOutOfBoundsException e){            
    	   System.out.println ("ArrayIndexOutOfBoundsException");        
    	   }
       


}
}