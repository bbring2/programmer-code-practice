package level1;

public class AddingCiphers {
    public static int addingCiphers(int n) {
        int intputValue = 0;

        while (n != 0) {
             intputValue += n%10;
             n /= 10;
        }
        return intputValue;
    }

    public static void main(String[] args) {
        int a = addingCiphers(718);

        System.out.println(a);
    }
}
