import java.util.Scanner;
public class RunLengthEncodedStr {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int i=0,j=0;
		int len=0;
		for(char a:ch){
			++len;
		}
		int flag=1;
		String str1="";
		for(i=0;i<len;i+=count+1){
			count=0;
			for(j=i+1;j<len;j++){
				if(str.charAt(i)==str.charAt(j)){
					++flag;
					++count;
				}
				else{
					break;
				}
			}
			if(flag>1){
				str1=str1+str.charAt(i)+flag;
			}
			else{
				str1=str1+str.charAt(i);
			}
			flag=1;
		}
		System.out.println(str1);
		sc.close();
	}
}
