package level2;

public class MinMax {
    public static String minMax() {
        String answer = "1 2 34 5";
        String[] tmpStr = answer.split(" ");
        int[] tmpInt = new int[tmpStr.length];

        for(int i=0; i<tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }

        int min = tmpInt[0];
        int max = tmpInt[0];

        for (int i = 0; i<tmpInt.length; i++) {
            if(min>tmpInt[i]) {
                min = tmpInt[i];
            }
            if(max<tmpInt[i]) {
                max = tmpInt[i];
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(minMax());
    }
}
