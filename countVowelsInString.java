public class countVowelsInString {
    public static void main(String[] args) {
        
        String a = "Education";

        int count=0;

        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println(count);
    }
}
