package Contest1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCount = scanner.nextLine();
        String secondCount = scanner.nextLine();
        int place = scanner.nextInt();

        String[] first = firstCount.split(":");
        String[] second = secondCount.split(":");

        int a = Integer.parseInt(first[0]);
        int b = Integer.parseInt(first[1]);
        int c = Integer.parseInt(second[0]);
        int d = Integer.parseInt(second[1]);

        int score = 0;

        if ((a + c) < (b + d)) {
            score += (b + d) - (a + c);
            c += score;
        }
        if ((a + c) == (b + d)) {
            switch (place) {
                case 1 -> {
                    if (c > b) break;
                    score += 1;
                }
                case 2 -> {
                    if (a > d) break;
                    score += 1;
                }
            }
        }

        System.out.println(score);
    }
}
