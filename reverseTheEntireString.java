public class reverseTheEntireString {
    public static void main(String[] args) {
        
        String a = "HelloWorld";

        StringBuilder result = new StringBuilder();

        for(int i = a.length()-1 ; i>=0 ; i--){
            result.append(a.charAt(i));
        }

        System.out.println(result);
    }
}
