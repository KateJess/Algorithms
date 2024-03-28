package Contest1;

import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        /**
         * У нас доступны 3 клавиши: Tab - 4 пробела, Space - 1 пробел и Backspace - -1 пробел.
         * Значит,
         * 4 пробела можно добавить 1 нажатием
         * 3 пробела - 2 нажатиями - Tab и Backspace
         * 2 пробела - 2 нажатиями - 2 раза Space
         * 1 пробел - 1 нажатием - Space
         * 0 пробелов - 0 нажатий
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(4, 1);
        map.put(3, 2);
        map.put(2, 2);
        map.put(1, 1);
        map.put(0, 0);

        Scanner scanner = new Scanner(System.in);

        int linesNumber = scanner.nextInt();
        long count = 0;

        for (int i = 0; i < linesNumber; i++) {
            int spacesCount = scanner.nextInt();
            count += spacesCount / 4 + map.get(spacesCount % 4);
        }

        System.out.println(count);
    }
}
