public class CountCharacterFrequency {
    public static void main(String[] args) {

        String s = "banana";

        // convert to lowercase (optional but good practice)
        s = s.toLowerCase();

        // loop through each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

            // skip if character already counted
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // count frequency
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
