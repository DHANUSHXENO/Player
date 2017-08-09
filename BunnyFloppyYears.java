import java.util.Scanner;
public class BunnyFloppyYears {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bunnies");
		int num=sc.nextInt();
		System.out.println("Total number of ears across all bunnies");
		System.out.println(calc(num));
		sc.close();
	}
	public static int calc(int num) {
		if(num==0) {
			return 0;
		}
		else {
			--num;
			return count+2+calc(num);
		}
	}
}
