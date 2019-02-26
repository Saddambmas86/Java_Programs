public class SelectionSort1 {

public static void main(String...s){

int []A={12,11,3,4,23,1};	
	
for(int i=0;i<A.length;i++){
int min=i;
for(int j=i+1;j<A.length;j++){
	if(A[j]<A[min]){
		min=j;
	}
}

int temp=A[i];
A[i]=A[min];
A[min]=temp;
}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]+" ");
}
	
}
	
}
