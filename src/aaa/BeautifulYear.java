package aaa;
import java.util.*;
public class BeautifulYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int cur=year+1;
		while(true) {
			String ystr=Integer.toString(cur);
			if(ystr.chars().distinct().count() == ystr.length()) {
				break;
			}
			cur++;
		}
		System.out.print(cur);
		
		
		

	}

}
