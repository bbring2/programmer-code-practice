package programmers.level1;

import java.util.Arrays;

public class KthNum {
    public static int[] findKthNum(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 10, 8, 2, 7, 1, 3, 6, 4};
        int[][] commands = {{1,6,4}, {4,5,2}, {2,4,3}};

        System.out.println(Arrays.toString(findKthNum(array, commands)));
    }
}
