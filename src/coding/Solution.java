package coding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    static int n, max;
    public static void dfs(int[] array, int depth) {
        if(depth==n) {
            solution(array);
            return;
        }
        for(int i=depth;i<n;i++) {
            swap(array, i, depth);
            dfs(array, depth+1);
            swap(array, i, depth);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void solution(int[] array) {
        int sum=0;
        for(int i=1;i<n;i++)
            sum+=Math.abs(array[i]-array[i-1]);

        max=Math.max(max, sum);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        int[] array=new int[n];
        max=0;
        for(int i=0;i<n;i++)
            array[i]=scan.nextInt();

        dfs(array, 0);
        System.out.println(max);
    }
}
