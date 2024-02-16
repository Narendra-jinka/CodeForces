package aaa;

import java.util.*;
public class Translation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		StringBuilder temp=new StringBuilder(s);//code
		temp.reverse();
		if(t.equals(temp.toString())) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
