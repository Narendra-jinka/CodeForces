package aaa;

import java.util.*;
public class Wrong_Subtraction {
	
	public static int subtraction(int n,int k) {
		while(k>0) {
			if(n%10 !=0) {
				n-=1;
			}
			else {
				n=n/10;
			}
			k--;
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		int k=Integer.parseInt(arr[1]);
		int n=Integer.parseInt(arr[0]);
		System.out.print(subtraction(n,k));

	}

}
