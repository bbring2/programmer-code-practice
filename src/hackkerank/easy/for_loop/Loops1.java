package hackkerank.easy.for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        for(int i=0; i<10; i++) {
            System.out.println(N + " X " + (i+1) + " = " + N*(i+1));
        }

        br.close();

    }
}
