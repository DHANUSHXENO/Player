import java.util.Scanner;
public class UprLowrCaseStrConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i;
		char ch[]=new char[str.length()];
		String str1="";
		for(i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				ch[i]=Character.toLowerCase(str.charAt(i));
			}
			if(Character.isLowerCase(str.charAt(i))) {
				ch[i]=Character.toUpperCase(str.charAt(i));
			}
			str1=str1+ch[i];
		}
		System.out.println(str1);
	}
}
