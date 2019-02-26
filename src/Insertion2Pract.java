
public class Insertion2Pract {

public static void main(String...s){

int A[]={2,1,4,3,5};	
int temp,j;

for(int i=0;i<A.length;i++){
temp=A[i];

for(j=i-1;j>0 && A[j]>temp;j--){


A[j+1]=A[j];	
}
A[j+1]=temp;	
}

	
}
	
	
}
