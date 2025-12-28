public class removeingDuplicateCharaters {
    public static void main(String[] args) {
        
        String sb = "Programming";

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < sb.length() ; i++){

            char ch = sb.charAt(i);

            if(result.indexOf(String.valueOf(ch)) != -1){
                continue;
            }

            result.append(sb.charAt(i));

        }

        System.out.println(result);
    }
}
