public class MissingNum {

public static void main(String...s){

int A[]={1,2,5,6,7,4};

int Miss=3;
int n=A.length+1;
int sumArray=n*(n+1)/2;
System.out.println(sumArray);
int sum=0;

for(int i=0;i<A.length;i++){
	sum=sum+A[i];
}

System.out.println(sum);

int MissNum=sumArray-sum;
System.out.println("Value of Miss number is "+MissNum);

	
}
}
