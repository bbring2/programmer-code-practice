package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;
        return image;
    }

    public static void main(String[] args) {

    }
}
