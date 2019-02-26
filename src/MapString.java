import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapString {
	
public static void main(String...s){
	
String A="SaddamHusain";
char ch[]=A.toLowerCase().toCharArray();
	
Map<Character,Integer> map1=new HashMap<>();

map1.put('a', 0);
map1.put('e', 0);
map1.put('i', 0);
map1.put('o', 0);
map1.put('u', 0);

for(int i=0;i<ch.length;i++){
if(map1.containsKey(ch[i])){
	map1.put(ch[i], map1.get(ch[i])+1);
}
	
}

System.out.println(map1);

	
	
}
	

}
