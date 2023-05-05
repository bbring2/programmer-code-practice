package hanteo_global;

import java.util.Arrays;

public class CoinCombi {

    public int change(int sum, int[] coins) {
        int[] tmpArr = new int[sum+1];
        tmpArr[0] = 1;

        for(int coin : coins) {
            for(int i=coin; i<=sum; i++) {
                tmpArr[i] += tmpArr[i-coin];
            }
        }

        return tmpArr[sum];
    }

}
