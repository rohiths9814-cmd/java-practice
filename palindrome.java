public class palindrome {
    public static void main(String[] args) {
        
        String a = "A man a plan a canal Panama";
        
        a = a.toLowerCase();
        a = a.replace(" ","");

        StringBuilder sb = new StringBuilder(a);
        
        sb.reverse();

        if(sb.toString().equals(a)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }
}
