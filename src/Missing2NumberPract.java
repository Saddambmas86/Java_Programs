import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missing2NumberPract {

	static public void displayMissing(int ar[]){
        
        System.out.print("\nNumbers missing in array:  ");
        int n=ar[ar.length-1];
        int j=0;
        for(int i=0;i<n;i++){
               if(j<ar.length && i==ar[j])
                     j++;
               else
                     System.out.print(i+" ");
               
        }
        
 }
public static void main(String[] args) {

    int a[] = { 1,3,4,5,7,11,12,15 };
    
   

    Missing2NumberPract.displayMissing(a);

}	

}
