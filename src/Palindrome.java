public class Palindrome {

public static void main(String...s){

//121
	
int n=121;
int temp=n;
int rev=0;

while(n!=0){
int rem=n%10;
rev=rev*10+rem;
n=n/10;	
}

if(rev==temp){
	System.out.println("Number is Palindrome");
	
}
else{
	System.out.println("Number is not Palindrome");
}
	
}	
}

//rem=1, rev=1, n=12, 
//rem=2, rev=12, n=1,
//rem=1, rev=121, n=0



