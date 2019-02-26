
public class SingleTon {
	
private static SingleTon T1=new SingleTon();

public static SingleTon getObject(){
	return T1;
}

public static void main(String...s){

SingleTon T2=SingleTon.getObject();
SingleTon T3=SingleTon.getObject();
System.out.println(T2);
System.out.println(T3);
	
}
	

}
