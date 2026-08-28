import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String text) {

        Map<Character, Integer> frequency = new HashMap<>();

        // Step 1: Count frequency of every character
        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Scan from left to right
        for (char ch : text.toCharArray()) {

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; // No character found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println(
                    "First Non-Repeating Character: '" + result + "'");
        }

        scanner.close();
    }
}