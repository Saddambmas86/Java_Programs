public class InsertionSort {

public static void main(String...s){

int []A={5,1,6,2,4,3};

int temp,j;

for(int i=1;i<A.length;i++){
	temp=A[i];
	j=i;
	
	while(j>0 && A[j-1]>temp){
		A[j]=A[j-1];
		j=j-1;
	}
	A[j]=temp;	
	
	
}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}
}}
//temp=1, j=1,A[j]=1
//temp=5, j=2,
//