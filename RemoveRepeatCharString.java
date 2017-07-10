import java.util.Scanner;
public class RemoveRepeatCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int i,j;
		int flag=0;
		for(i=ch.length-1;i>=0;i--) {
			for(j=ch.length-1;j>=i;j--) {
				if(ch[i]==ch[j] && i!=j) {
					++flag;
				}
			}
			if(flag==0) {
				System.out.print(ch[i]);
			}
			flag=0;
		}
	}
}
