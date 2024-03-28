import java.util.Scanner;

public class Fibonacci {

    public static final int COEFFICIENT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        int period = getPeriod(m);
        int index = (int) (n == 1 ? n : n % period);
        System.out.println(getFibNum(index, m));
    }

    public static int getPeriod(int m) {
        int[] array = new int[m * COEFFICIENT];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= array.length; i++) {
            if (i > 2 && array[i - 1] == 1 && array[i - 2] == 0) {
                return i - 2;
            }
            array[i] = (array[i - 1] + array[i - 2]) % m;
        }
        return m;
    }

    public static int getFibNum(int n, int m) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        int next = 0;

        for (int i = 2; i < n + 1; i++) {
            next = (first + second) % m;
            first = second;
            second = next;
        }
        return next;
    }
}
