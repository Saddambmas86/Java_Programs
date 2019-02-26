
public class Parent extends Child {

public static void main(String...s){

int age=12;	
	
try{
if(age<18){
	throw new Parent();
}
}
catch(Parent P){
	System.out.println("Parent class exception caught");
}
	
}
	
	
	
	
}


class Child extends Exception{
	
}


