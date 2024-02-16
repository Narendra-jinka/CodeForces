package aaa;
import java.util.*;
public class Petya_and_Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int res=s1.toLowerCase().compareTo(s2.toLowerCase());
		if(res <0) {
			System.out.print(-1);
		}
		else if(res>0) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
		
	}

}
