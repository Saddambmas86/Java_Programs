import java.util.Arrays;

public class StringReverse {
	
	
public static void main(String...s){
	
String A="Flash and Arrow Vs SuperGirl";
System.out.println(A);

char[] B=A.toCharArray();
//char C[]=new char[B.length];
char result[]=new char[B.length];

for(int i=0;i<result.length;i++){
	if(B[i]==' '){
		result[i]=' ';
	}
}

int j=result.length-1;
for(int i=0;i<B.length;i++){
if(B[i]!=' '){

if(result[j]==' '){
	j--;
}

result[j]=B[i];
j--;
}}

for(int i=0;i<result.length;i++){
	System.out.print(result[i]);
}


}

}
