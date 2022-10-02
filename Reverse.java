package day2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=3456, reminder = 0, reverse=0;
int i=1;
while(i<5) {
	reminder=number%10;
	reverse=reverse*10+reminder;
	number=number/10;
	i++;
}
System.out.println("Reverse Number is:"+reverse);
	}

}
