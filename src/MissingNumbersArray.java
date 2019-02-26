
public class MissingNumbersArray {

public static void main(String...s){

int A[]={1,2,3,5,6,7,11};

int n=A[A.length-1];
System.out.println(n);

System.out.println("Missing numbers are: ");
int j=0;
for(int i=0;i<n;i++){
if(j<A.length && A[j]==i){
	j++;
}
else{
System.out.println(i);	
}
}



	
	
	
	
}
	
	
}
