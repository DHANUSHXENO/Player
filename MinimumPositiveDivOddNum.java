import java.util.Scanner;
public class MinimumPositiveDivOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		do {
			++i;
		}while(!(n%i==1));
		System.out.println("Minimum positive integer to be divided to make the number odd"+i);
		sc.close();
	}
}
