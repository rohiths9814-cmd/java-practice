public class reverseEachWords {
    public static void main(String[] args) {
        
        String a = "Java is easy";

        String words[] = a.split( " ");

        StringBuilder reverse = new StringBuilder();

        for(int i = 0 ; i < words.length ; i++ ){

            StringBuilder sb = new StringBuilder(words[i]);

            sb.reverse();

            reverse.append(sb).append(" ");
        }

        System.out.println(reverse.toString().trim());
    }
}