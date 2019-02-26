
public class countPlus {
	
public static void main(String...s){

String A="I love Flash";

char B[]=A.toCharArray();
char res[]=new char[B.length];

for(int i=0;i<B.length;i++){
	if(B[i]==' '){
		res[i]=' ';
	}
}

int j=res.length-1;
for(int i=0;i<B.length;i++){

if(B[i]!=' '){

if(res[j]==' '){
	j--;
}

res[j]=B[i];
j--;

	
}
}

for(int i=0;i<res.length;i++){
	System.out.print(res[i]);
}
	
	
}
}