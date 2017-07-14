import java.util.Scanner;
public class StringValidateNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		int flag=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'
				    ||str.charAt(i)=='.'||str.charAt(i)=='e'||str.charAt(i)=='E') {
				++flag;
			}
		}
		if(flag==str.length()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
