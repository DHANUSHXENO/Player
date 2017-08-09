package player;
import java.util.Scanner;
public class IdenticalCharAdjacentSeperatedFromEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			System.out.print(separate(str,i));
		}
		sc.close();
	}
	public static String separate(String str,int i) {
		String str1="";
		if(str.charAt(i)=='\0') {
			str1=str1+"";
		}
		else if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ) {
			return str.charAt(i)+"*";
		}
		else {
			return str.charAt(i)+"";
		}
		return "";
	}

}
