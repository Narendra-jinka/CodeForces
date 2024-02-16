package aaa;
import java.util.*;
public class Nearly_Lucky_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		long num=s.nextLong();
		int res=isLucky(num);
		if(res == 4 || res==7) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		

	}
	public static int isLucky(Long num) {
		int count=0;
		while(num >0) {
			long cur=num%10;
			if(cur ==4 || cur == 7) {
				count++;
			}
			num/=10;
		}
		return count;
	}

}
