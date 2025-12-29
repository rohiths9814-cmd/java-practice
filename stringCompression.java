public class stringCompression {
    public static void main(String[] args) {
        
        String a = "aaabbcdd";

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0 ; i< a.length()-1 ; i++){

            if (a.charAt(i) == a.charAt(i + 1)){
                count++;
            }else{
                result.append(a.charAt(i)).append(count);
                count = 1;
            }
        }

        result.append(a.charAt(a.length()-1)).append(count);

        System.out.println(result);
    }
}
