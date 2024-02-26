package aaa;

import java.util.*;
public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String _hello="hello";
		int i=0,j=0;
		if(str.length() < _hello.length()) {
			System.out.print("NO");
			return;
		}
		while(i<_hello.length() && j < str.length() ) {
			if(_hello.charAt(i) == str.charAt(j)) {
				i++;
			}
			j++;
		}
		if(i==_hello.length()) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
