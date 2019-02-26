import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prac {
	
	public static void main(String[] args) {
	      String str = "AEAAAAAAIOG";
	      LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
	      hMap.put('A', 0);
	      hMap.put('E', 0);
	      hMap.put('I', 0);
	      hMap.put('O', 0);
	      hMap.put('U', 0);
	      System.out.println("Debugging");
	      for (int i = 0; i <= str.length() - 1; i++) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         }
	      }
	      System.out.println(hMap);
	   }	

}
