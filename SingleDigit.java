package day2;
import java.util.*;
public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner h=new Scanner(System.in);
System.out.println("Enter Single digit:");
int num=h.nextInt();
if(num==0) {
	System.out.println(num+":Zero");
}
else if(num==1) {
	System.out.println(num+":One");
}
else if(num==2) {
	System.out.println(num+":Two");
}
else if(num==3) {
	System.out.println(num+":Three");
}
else if(num==4) {
	System.out.println(num+":Four");
}
else if(num==5) {
	System.out.println(num+":Five");
}
else if(num==6) {
	System.out.println(num+":Six");
}
else if(num==7) {
	System.out.println(num+":Seven");
}
else if(num==8) {
	System.out.println(num+":Eight");
}
else if(num==9) {
	System.out.println(num+":Nine");
}
else {
		System.out.println(num+":is not Single Digit");
}
	}

}
