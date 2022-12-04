import java.util.Scanner;

public class Main {
    static long get_Ncr(long r, long n) {
        long Ncr = 1;
        long diff = 1;
        long nomenator = 1;
        for (long i = r + 1; i <= n; i++) {
            Ncr *= i;
            nomenator *= diff;
            diff++;
        }
        Ncr /= nomenator;
        return Ncr;
    }

    static long get_Npr(long r, long n) {
        long Npr = 1;
        for (long i = n - r + 1; i <= n; i++) {
            Npr *= i;
        }
        return Npr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n = obj.nextInt();
        long r = obj.nextInt();
        System.out.println(get_Ncr(r, n));
        System.out.println(get_Npr(r, n));


    }
}