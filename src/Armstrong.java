public class Armstrong {

public static void main(String...s){

int n=153;
int digit=0;
int temp=n;
int A=0;
int temp1=n;

while(temp!=0){
	digit=digit+1;
	temp=temp/10;
}
System.out.println(digit);

while(n!=0){
	int rem=n%10;
	A=A+(int)Math.pow(rem, digit);
	n=n/10;
}

if(temp1==A){
	System.out.println("Armstrong");
}
else{
	System.out.println("Not Armstrong");
}

}
}

