import java.util.HashMap;
import java.util.Scanner;


public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashMap<Character, Integer> dictionary = new HashMap<>();

        char letter = ' ';
        int frequency = 0;

        for (char character: input.toCharArray()){
            if (dictionary.containsKey(character)){
                int count = dictionary.get(character) + 1;
                dictionary.replace(character, count);
                if (frequency < count) {
                    frequency = count;
                    letter = character;
                }
            } else {
                dictionary.put(character, 1);
            }
        }

        System.out.println("Самая часто встречающаяся буква: \"" + letter +
                "\".\nЧастота использования буквы: " + frequency);
    }
}
