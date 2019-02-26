
public class OccuranceOfString {
	
public static void main(String...s){

	
String A="ABCDAajkgsgakjasjf";
String T1="a";
String C[]=A.split(" ");
String B[]=A.split("");
char A1[]=A.toCharArray();
char T11=T1.charAt(0);
System.out.println(T11);


int count=0;

for(int i=0;i<A1.length;i++){

if(A1[i]==(T11)){
	count++;
}
	
}

System.out.println(count);



	
	
	
}
	

}
