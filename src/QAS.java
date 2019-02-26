import java.util.HashMap;
import java.util.Hashtable;

public class QAS {

public static void main(String...s){

String inputString="I lo v";
System.out.println("v ol I");
	
char[] inputStringArray = inputString.toCharArray();
char[] resultArray = new char[inputStringArray.length];
   
    
for (int i = 0; i < inputStringArray.length; i++) {
        if (inputStringArray[i] == ' ') 
        {
            resultArray[i] = ' ';
        }
}  
int j = resultArray.length-1;
//Second for loop :
//we copy every non-space character of inputStringArray 
//from first to last at 'j' position of resultArray
    
for (int i = 0; i < inputStringArray.length; i++){
        if (inputStringArray[i] != ' ') 
        {//If resultArray already has space at index j then decrementing 'j'
            if(resultArray[j] == ' '){
                j--;
         }
            resultArray[j] = inputStringArray[i];
            j--;
        }
    }
    
    System.out.println(inputString+" ---> "+String.valueOf(resultArray));
}

	
	
	
}
