package aaa;

import java.util.*;
public class Stones_on_The_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int count=0;
		for(int i=0; i<n-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
		}
		System.out.print(count);
		
		
	}

}
