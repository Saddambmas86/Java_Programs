import java.util.HashMap;
import java.util.Map;

public class CountChar {

public static void main(String...s){

String A="ArrowSuperArrow";	
char ch[]=A.toLowerCase().toCharArray();

Map<Character, Integer>map1=new HashMap<>();

for(int i=0;i<ch.length;i++){
if(!map1.containsKey(ch[i])){
	map1.put(ch[i], 1);
}
else{
	map1.put(ch[i], map1.get(ch[i])+1);
}}

System.out.println(map1);


Map <Character, Integer>map2=new HashMap<>();
map2.put('a', 0);
map2.put('e', 0);
map2.put('i', 0);
map2.put('o', 0);
map2.put('u', 0);


for(int i=0;i<ch.length;i++){
	if(map2.containsKey(ch[i])){
		map2.put(ch[i], map2.get(ch[i])+1);
	}
}

System.out.println(map2);



	
	
}}
