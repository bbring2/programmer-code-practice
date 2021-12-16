package programmers.level1;

import java.util.Locale;

public class PY {
    public static boolean findPY(String s) {
        boolean answer = true;

        int lowerPCount = 0;
        int upperPCount = 0;
        int lowerYCount = 0;
        int upperYCount = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.contains("p")) {
                lowerPCount++;
            } else if(s.contains("y")) {
                lowerYCount++;
            } else if(s.contains("P")) {
                upperPCount++;
            } else if(s.contains("Y")) {
                upperYCount++;
            }
        }

        int totalP = lowerPCount+upperPCount;
        int totalY = lowerYCount+upperYCount;

        if(totalP==totalY) {
            return answer;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(findPY("pPoooyY"));
    }
}
