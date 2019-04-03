import java.util.Scanner;


public class Travel {
	int t,n;
	Scanner sc=new Scanner(System.in);

long case1(){
	int first[]=new int[10];
	t=sc.nextInt();
	n=sc.nextInt();
	long answer=0;
	for(int i=0;i<4;i++)
		first[i]=sc.nextInt();
	 while(n>3)
	 {
	   answer= answer+max(first[0]+ (2*first[1])+first[n-1],(2*first[0])+first[n-1]+first[n-2]);
	   n=n-2;
	}
	 return answer+first[1];

}


long case2(){
	int second[]=new int[10];
long answer=0;
int two=sc.nextInt();
for(int i=0;i<two;i++)
	second[i]=sc.nextInt();
	while(n>3)
	 {
	   answer= answer+max(second[0]+ (2*second[1])+second[n-1],(2*second[0])+second[n-1]+second[n-2]);
	   n=n-2;
	}
	return answer+second[1];
}


long case3(){
	long answer=0;
	int third[]=new int[5];
	int three=sc.nextInt();
	for(int i=0;i<three;i++)
		third[i]=sc.nextInt();
	while(n>3)
	 {
	   answer= answer+max(third[0]+ (2*third[1])+third[n-1],(2*third[0])+third[n-1]+third[n-2]);
	   n=n-2;
	}
return answer+third[0]+third[1]+third[2];
}


long case4(){
	int fourth[]=new int[10];
	long answer=0;
	int four=sc.nextInt();
	for(int i=0;i<four;i++)
		fourth[i]=sc.nextInt();
	
	   answer= answer+max(fourth[0]+ (2*fourth[1])+fourth[n-1],(2*fourth[3])+fourth[0]+(fourth[1])/2);	
	return answer;
}


int max(int a, int b){
	if(a<b)
		return a;
	else return b;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Travel obj=new Travel();
System.out.println(obj.case1());
System.out.println(obj.case2());
System.out.println(obj.case3());
System.out.println(obj.case4());
	}

}
