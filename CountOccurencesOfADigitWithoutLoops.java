import java.util.Scanner;
public class CountOccurencesOfADigitWithoutLoops {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		System.out.println("Enter the digit to be checked");
		int digit=sc.nextInt();
		findDigit(num,digit);
		System.out.println("Number of occurrences of "+digit+" in number "+num+" is "+count);
		sc.close();
	}
	public static int findDigit(int num,int digit) {
		if(num==0) {
			return 0;
		}
		else {
			int a=num%10;
			if(a==digit) {
				++count;
			}
			num=num/10;
			return findDigit(num,digit);
		}
	}
}
