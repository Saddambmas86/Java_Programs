import java.util.LinkedList;

public class Linked {

public static void main(String...s){

LinkedList list=new LinkedList();

list.addFirst("Saddam");
list.addLast("Husain");
list.add(1, "Mansoori");
list.add(2, "Khan");
	
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.get(2));
System.out.println(list.getLast());

}
	
	
}
