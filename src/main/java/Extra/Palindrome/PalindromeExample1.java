package Extra.Palindrome;

public class PalindromeExample1 {

    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(palindromeCheck(str));  // Output: true
    }

    public static boolean palindromeCheck(String word) {
        // Convert the string to lowercase for case-insensitive comparison
        String s = word.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            // Check if characters match
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // Early return if mismatch occurs
            }
            left++;
            right--;
        }

        return true;  // Return true if the entire string is a palindrome
    }


}
