package aaa;

import java.util.*;

public class Vanya_and_Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String[] ch=input1.split(" ");
		int n=Integer.parseInt(ch[0]);
		int h=Integer.parseInt(ch[1]);
		String input2=sc.nextLine();
		String[] ch2=input2.split(" ");
		int[] hights=new int[ch2.length];
		for(int i=0;i<ch2.length;i++) {
			hights[i]=Integer.parseInt(ch2[i]);
		}
		
		int wid=0;
		for(int i:hights) {
			
			if(i>h) {
				wid+=2;
			}
			else {
				wid+=1;
			}
		}
		
		
		System.out.print(wid);

	}

}
