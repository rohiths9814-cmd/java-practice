public class countVowelsInString {
    public static void main(String[] args) {
        
        String a = "Education";

        int count=0;

        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    
            }
        }

        System.out.println(count);
    }
}
