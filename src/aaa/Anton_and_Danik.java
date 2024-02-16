package aaa;

import java.util.*;
public class Anton_and_Danik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		int a=0,d=0;
		for(char c:str.toCharArray()) {
			if(c == 'A') {
				a++;
			}
			else {
				d++;
			}
		}
		if(a>d) {
			System.out.print("Anton");
		}
		else if(a<d) {
			System.out.print("Danik");
		}
		else {
			System.out.print("Friendship");
		}
	}

}
