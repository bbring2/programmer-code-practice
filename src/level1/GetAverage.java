package level1;

public class GetAverage {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer/(double)arr.length;
    }
}
