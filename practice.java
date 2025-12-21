public class practice {
    public static void main(String[] args) {

        String s = "madam";
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
