package player;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int i,j;
		int flag=0;
		for(i=0;i<ch.length;i++) {
			for(j=i;j<ch.length;j++) {
				if(ch[i]==ch[j] && i!=j) {
					++flag;
				}
			}
			if(flag==0) {
				System.out.print(ch[i]);
				break;
			}
			flag=0;
		}
		sc.close();
	}

}
