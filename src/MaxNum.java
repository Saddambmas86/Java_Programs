public class MaxNum {

public static void main(String...s){

int []A={12,11,13,10,2,3,56};	

int Max=A[0];

for(int i=1;i<A.length;i++){
	if(A[i]>Max){
		Max=A[i];
	}
}
System.out.println(Max);
}
	
	
	
}
