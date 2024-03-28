package Contest1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        /** Ключевые идеи:
         * Заводить множества или списки нельзя - большие входные данные
         * (ML/TL)
         */
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int v = scanner.nextInt();
        int q = scanner.nextInt();
        int m = scanner.nextInt();

        int minVasya = p - v;
        int maxVasya = p + v;

        int minMasha = q - m;
        int maxMasha = q + m;

        /** Рассматриваем два варианта: когда отрезки пересекаются и когда не пересекаются
         * в первом случае необходимо найти МАКСИМАЛЬНОЕ число из двух минимальных (minVasya или minMasha)
         * и сравнить его с МИНИМАЛЬНЫМ из двух максимальных (maxVasya или maxMasha)
         * применяется сравнение вида меньше или равно: макс. минимальное <= мин. максимальное
         * если true, то берем максимальное из двух максимальных и минимальное из двух минимальных
         * (это наши границы отрезка)
         * и возвращаем |max + min| + 1
         *
         * в противном случае (при отсутствии пересечения)
         * возвращаем (|max1 - min1| + 1) + (|max2 - min2| + 1)
         */

        if (Math.max(minVasya, minMasha) <= Math.min(maxVasya, maxMasha)) {
            System.out.println(Math.abs(Math.max(maxVasya, maxMasha) - Math.min(minVasya, minMasha)) + 1);
        } else {
            System.out.println((Math.abs(maxVasya - minVasya) + 1) + (Math.abs(maxMasha - minMasha) + 1));
        }
    }
}
