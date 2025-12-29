public class removeDuplicateWords {
    public static void main(String[] args) {
         
        String s = "java is java easy is java";

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i<words.length ; i++ ){

            if(!result.toString().contains(words[i] + " ")){
                result.append(words[i]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
