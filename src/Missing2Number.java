public class Missing2Number {
	
public static void main(String...s){
	
	
	int A[]={1,2,3,5,6,8};
	int sumGiven=0;
	for(int i=0;i<A.length;i++){
	sumGiven=sumGiven+A[i];
	}
	System.out.println("Sum of Given Array "+sumGiven);
	int n=A.length+2;
	int sumExpected=n*(n+1)/2;
	System.out.println("Value of sum1 "+sumExpected);

	int MissingNumSum=sumExpected-sumGiven;
	System.out.println("sum of Missing numbers "+MissingNumSum);

	int MissAverage=MissingNumSum/2;
	System.out.println("Average of Missing numbers "+MissAverage);

	int sumSmallestHalf=0;
	int sumGreatestHalf=0;

for(int i=0;i<n-2;i++){
if(A[i]<=MissAverage){
		sumSmallestHalf=sumSmallestHalf+A[i];
}
else{
sumGreatestHalf=sumGreatestHalf+A[i];
}
}

	System.out.println("sumSmallestHalf=" +sumSmallestHalf);
	System.out.println("sumGreatestHalf=" +sumGreatestHalf);	


	System.out.println("Two Missing " +  
            "Numbers are"); 

// The first (smaller) element =  
// (sum of natural numbers upto  
// avg) - (sum of array elements 
// smaller than or equal to avg) 
int totalSmallerHalf = (MissAverage *  
                (MissAverage + 1)) / 2; 
System.out.println(totalSmallerHalf -  
              sumSmallestHalf); 

// The first (smaller) element =  
// (sum of natural numbers from 
// avg+1 to n) - (sum of array  
// elements greater than avg) 
System.out.println(((n * (n + 1)) / 2 -  
             totalSmallerHalf) -  
                sumGreatestHalf); 





	
	
	
	
	











	
}
	

}







