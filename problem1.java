public class problem1 {
    public static void main(String[] args) {
        
        String demo="Welcome";

        int vowels=0;
        int consonants=0;

        demo = demo.toLowerCase();

        for(int i=0;i<demo.length();i++){

            if(demo.charAt(i)=='a' || demo.charAt(i)=='e' || demo.charAt(i)=='i' || demo.charAt(i)=='o' || demo.charAt(i)=='u'){
                vowels++;
            }else if((demo.charAt(i)>='a' && demo.charAt(i)<='z')){
                consonants++;
            }
        }

        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
