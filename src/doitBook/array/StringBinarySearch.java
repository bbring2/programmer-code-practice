package doitBook.array;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] x = {"abstract", "access", "boolean", "break", "cat", "car",
        "eraser", "east", "foot", "fear", "gas", "golf", "hand", "have",
        "ice", "import", "jacket", "jar", "key", "king", "lemon", "lead",
        "monkey", "make", "nose", "nasty", "odd", "origin", "peer", "poll",
        "queen", "query", "rose", "rain", "soul", "solid", "throw", "this",
        "vase", "void", "while", "white", "yield", "zoo"};

        System.out.println("원하는 키워드를 입력하세요 : ");
        String ky = scanner.next();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0) {
            System.out.println("해당 키워드가 존재하지 않습니다.");
        } else
            System.out.println("해당 키워드는 " + idx + "번째에 있습니다.");
    }
}
