import java.util.Scanner;
public class LongestValidParenthesisOfLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i;
		int count=0;
		for(i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='(' && str.charAt(i+1)==')') {
				count+=2;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
