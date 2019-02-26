import java.util.Scanner;

public class ReverseString {

public static void main(String...s){

Scanner Scan=new Scanner(System.in);	
System.out.println("Enter the String");	
	
String A=Scan.next();

/*char[]B=A.toCharArray();
int l=B.length;
for(int i=1;i<=l;i++){
	System.out.print(B[l-i]);
}
*/	
System.out.println(A.length());

for(int i=A.length()-1;i>=0;i--){
	System.out.println(A.charAt(i));
}


for(int i=0 ; i<A.length(); i++){
    if(A.charAt(i)== ' '){
    	
    }
    }




}
	
	
	
}
