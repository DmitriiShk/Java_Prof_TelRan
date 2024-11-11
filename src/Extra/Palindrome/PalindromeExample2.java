package Extra.Palindrome;

public class PalindromeExample2 {

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"Madam", "Hello", "racecar", "A man a plan a canal Panama", "", "Noon"};

        for (String str : testStrings) {
            System.out.println(str + ": " + palindromeCheck(str));
        }
    }

    public static boolean palindromeCheck(String word) {
        String s = word.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

