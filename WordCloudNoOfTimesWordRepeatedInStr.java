package player;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class WordCloudNoOfTimesWordRepeatedInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
		String str=sc.nextLine();
		String strArr[]=str.split(" ");
		int i,j;
		int flag=1;
		for(i=0;i<strArr.length;i++) {
			for(j=0;j<strArr.length;j++) {
				if(strArr[i].equals(strArr[j]) && i!=j) {
					++flag;
				}
			}
			if(flag>=0) {
				ts.add(strArr[i]+" "+flag);
			}
			flag=1;
		}
		Iterator<String> it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
