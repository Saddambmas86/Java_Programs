
public class DuplicateInString {
	
public static void main(String...s){

String A="Saddamm";

char[]B=A.toCharArray();
int count=0;

for(int i=0;i<A.length();i++){
	for(int j=i+1;j<A.length();j++){
		if(B[i]==B[j]){
			System.out.println("duplicate char is "+B[i]);
			//count++;
		
		}
	}
}


	
}
	

}
