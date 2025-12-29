public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "swiss";
        s = s.toLowerCase();

        int[] freq = new int[26];

        // Step 1: count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Step 2: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
