package aaa;
import java.util.*;
public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		boolean res=true;
		for(String str:arr) {
			if(str.equals("1")) {
				res=false;
				break;
			}
		}
		if(res) {
			System.out.print("EASY");
		}
		else {
			System.out.print("HARD");
		}
	}

}
