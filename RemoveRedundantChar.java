import java.util.Scanner;
public class RemoveRedundantChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int i,j;
		int flag=0;
		int count=0;
		for(char c : ch ){
			++count;
		}
		for(i=0;i<count;i++){
			for(j=i;j<count;j++){
				if(str.charAt(i)==str.charAt(j) && i!=j){
					//System.out.println( str.charAt(i)+" "+str.charAt(j) );
					++flag;
					break;
				}
			}
			if(flag==0){
				System.out.print(str.charAt(i));
			}
			flag=0;
		}
		sc.close();

	}

}
