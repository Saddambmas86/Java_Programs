public class MinNumber {

	public static void main(String...s){

		int []A={12,11,13,10,2,3,56};	

		int Min=A[0];

		for(int i=1;i<A.length;i++){
			if(A[i]<Min){
				Min=A[i];
			}
		}
		System.out.println(Min);
		}
				
	
}
