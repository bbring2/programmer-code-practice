package baekjoon.array;

/*
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
*/

import java.util.Arrays;

public class P1672 {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int[] subAccount = new int[accounts[0].length];

        for(int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for(int bank : customer) {
                currentCustomerWealth += bank;
            }
            max = Math.max(max, currentCustomerWealth);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2},{3,5},{1,9}};
        System.out.println(maximumWealth(accounts));
    }

}
