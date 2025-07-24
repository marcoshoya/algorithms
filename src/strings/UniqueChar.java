package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("rocketlawyer")); // Output: rocketlawy
    }

    private static String removeDuplicates(String word) {

        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        char[] input = word.toCharArray();

        for (char c : input) {
            if (!set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }

        return result.toString();

    }


}
