import java.util.Scanner;
public class DecimalToBinOctHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal Number");
		int dec=sc.nextInt();
		System.out.println("Binary number : "+Integer.toBinaryString(dec));
		System.out.println("Octal number : "+Integer.toOctalString(dec));
		System.out.println("Hexadecimal number : "+Integer.toHexString(dec));
		sc.close();
	}
}
