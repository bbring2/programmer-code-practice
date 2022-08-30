package doitBook.array;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySearch 이진검색하기
public class BinarySearchTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; //요소수가 num개인 배열 생성

        System.out.println("오름 차순으로 입력하세요.");

        System.out.println("x[0] : "); //배열 첫 요소 입력
        x[0] = scanner.nextInt();

        for(int i=1; i<num; i++) {
            do {
                System.out.println("x["+i+"] : ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.println("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0) {
            System.out.println("해당 요소는 존재하지 않는 값입니다.");
        } else {
            System.out.println(ky+"는 x["+idx+"] 에 있습니다.");
        }
    }
}
