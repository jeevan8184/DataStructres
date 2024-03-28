package Maps;

import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         int N = 5;

//         for (int n = 1; n < N; n++) {
//             int dp[] = new int[n];
//             dp[0] = 1;
//             for (int i = 0; i < n; i++) {
//                 for (int j = i; j > 0; j--) {
//                     dp[j] += dp[j - 1];
//                 }
//             }
//             for (int num : dp) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();

//         }

//     }
// }

public class practice {

    public static int minPushes(String word) {
        // Define the mappings for each key on the telephone keypad
        char[][] keypadMappings = {
                {}, // Key 0
                {}, // Key 1
                { 'a', 'b', 'c' }, // Key 2
                { 'd', 'e', 'f' }, // Key 3
                { 'g', 'h', 'i' }, // Key 4
                { 'j', 'k', 'l' }, // Key 5
                { 'm', 'n', 'o' }, // Key 6
                { 'p', 'q', 'r', 's' }, // Key 7
                { 't', 'u', 'v' }, // Key 8
                { 'w', 'x', 'y', 'z' } // Key 9
        };

        int totalPushes = 0;

        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            // Find the key that minimizes the number of pushes for the current character
            int minPushesForChar = Integer.MAX_VALUE;
            for (int key = 2; key <= 9; key++) {
                int pushes = 0;
                for (char mappedChar : keypadMappings[key - '0']) {
                    if (mappedChar == c) {
                        break;
                    }
                    pushes++;
                }
                minPushesForChar = Math.min(minPushesForChar, pushes);
            }

            totalPushes += minPushesForChar;
        }

        return totalPushes;
    }

    public static void main(String[] args) {
        String word1 = "abcde";
        System.out.println("Output for " + word1 + ": " + minPushes(word1));

        String word2 = "xycdefghij";
        System.out.println("Output for " + word2 + ": " + minPushes(word2));
    }
}
