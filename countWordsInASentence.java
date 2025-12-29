public class countWordsInASentence {
    public static void main(String[] args) {
        
        String a = "Java is very easy";

        String[] words = a.split(" ");

        int count = words.length;

        System.out.println(count);
    }
}
