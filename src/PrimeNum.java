import java.util.Scanner;

public class PrimeNum {

public static void main(String...s){

	
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number");
int n=Scan.nextInt();

int temp=0;

for(int i=2;i<=n-1;i++){
	if(n%i==0){
		temp=temp+1;
	}
}

if(temp==0){
	System.out.println("number is prime");
}
else{
	System.out.println("Number is not prime");
}

}
	
	
}
