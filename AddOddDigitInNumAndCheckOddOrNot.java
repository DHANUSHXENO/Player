import java.util.Scanner;
public class AddOddDigitInNumAndCheckOddOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<(n+"").length();i++) {
			int a=n%10;
			if(a%2==1) {
				sum=sum+a;
			}
			n=n/10;
		}
		sc.close();
		System.out.println(validate(sum));
	}
	static int validate(int sum) {
		if(sum%2==0) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
