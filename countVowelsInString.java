public class countVowelsInString {
    public static void main(String[] args) {
        
        String a = "Education";
        String vowels = "aeiou";

        int count=0;

        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                count++;
            }
        }

        System.out.println(count);
    }
}
