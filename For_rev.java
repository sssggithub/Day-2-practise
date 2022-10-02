package day2;

public class For_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=3456, reminder = 0, reverse=0;
		for(;number!=0;) {
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
System.out.println("Reverse Number is:"+reverse);
	}

}
