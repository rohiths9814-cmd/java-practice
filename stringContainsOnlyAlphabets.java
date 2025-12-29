public class stringContainsOnlyAlphabets {
    public static void main(String[] args) {
        
        String a = "Java123";

        boolean onlyAlphabets = true;

        for(int i = 0; i<a.length(); i++){
            if(!Character.isLetter(a.charAt(i))){
            onlyAlphabets = false;
            break;
            }
        }

        System.out.print(onlyAlphabets);
    }
}
