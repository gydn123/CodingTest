import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 테스트 단어 갯수
            sc.nextLine();

            String[] words = new String[N];
            for (int j = 0; j < N; j++) {
                words[j] = sc.nextLine();
            }

            String palindrome = findPalindromePair(words);
            if (palindrome != null) {
                System.out.println(palindrome);
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
    public static String findPalindromePair(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i == j) {
                    continue;
                }

                String combined = words[i] + words[j];

                if ( isPalindrome(combined)) {
                    return combined;
                }

            }
        }
        return null;
    }

    public static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }
}