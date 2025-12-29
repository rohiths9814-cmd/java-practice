public class countUpperLowerDigits {
    public static void main(String[] args) {
        
        String a = "JaVa123";

        int upper = 0;
        int lower = 0;
        int digits = 0;

        for ( int i=0; i<a.length() ; i++){

            char ch = a.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }else if(Character.isDigit(ch)){
                digits++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("LowerCase = " + lower);
        System.out.println("digits = " + digits);

    }
}
