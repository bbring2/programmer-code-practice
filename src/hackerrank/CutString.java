package hackerrank;

import java.util.Scanner;

public class CutString {

    public static String cutString(String ex, int start, int end) {
        return ex.substring(start, end);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String[] scArr = A.split("");

        for(int i=0; i< scArr.length; i++) {
            if(scArr[i].equals(scArr[scArr.length-i-1])) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
