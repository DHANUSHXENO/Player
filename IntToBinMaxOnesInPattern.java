import java.util.Scanner;
public class IntToBinMaxOnesInPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toBinaryString(n);
		int i,j;
		char ch[]=str.toCharArray();
		int count=0;
		int temp=0;
		for(i=0;i<ch.length;i++) {
			for(j=i;j<ch.length-1;j++) {
				if(ch[j]==ch[j+1] && ch[j]=='1' && ch[j+1]=='1') {
					++count;
				}
				if(ch[j]=='0') {
					break;
				}
			}
			if(count>=temp) {
				temp=count;
			}
			count=0;
		}
		String str1="";
		for(i=0;i<=temp;i++) {
			String a="1";
			str1=str1+a;
		}
		System.out.println(str1);
		sc.close();
	}
}
