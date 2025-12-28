public class largestWordInASentence {
    public static void main(String[] args) {
        
        String sentence = "Java programming is very easy";

        String words[] = sentence.split(" ");

        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            
            if( words[i].length() > max.length() ){
                max = words[i];
            }
            
        }

        System.out.println(max);
    }
}
