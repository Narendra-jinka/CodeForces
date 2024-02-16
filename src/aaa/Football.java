package aaa;

import java.util.*;
public class Football {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' && i + 6 < str.length()) {
                if (str.substring(i, i + 7).equals("1111111")) {
                    System.out.println("YES");
                    return; // exit the program after printing "YES"
                }
            }
            if (str.charAt(i) == '0' && i + 6 < str.length()) {
                if (str.substring(i, i + 7).equals("0000000")) {
                    System.out.println("YES");
                    return; // exit the program after printing "YES"
                }
            }
        }
        System.out.println("NO"); // print "NO" if no consecutive sequence is found
    }

}
