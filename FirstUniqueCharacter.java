import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "Ujjwal";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + firstUniqChar(s1));

        String s2 = "loveUjjwal";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + firstUniqChar(s3));
    }
}


//solution
// Input: Ujjwal
// Output: 0
// Input: loveUjjwal
// Output: 1
// Input: aabb
// Output: -1