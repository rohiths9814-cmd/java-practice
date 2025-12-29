public class oddIndexLetter {
    public static void main(String[] args) {
        
        String a = "Programming";

        for(int i = 1 ; i < a.length() ; i+=2){
            System.out.print(a.charAt(i) + " ");
        }
    }
}
