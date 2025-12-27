public class stringBuilder {
    public static void main(String[] args) {

        String example = "Java is very easy";
        
        StringBuilder demo = new StringBuilder();

        for (int i = 0; i < example.length(); i++) {
            

            if(example.charAt(i) == ' ') {
                continue;
            }

            demo.append(example.charAt(i));
        }

        System.out.print(demo);
    }
}
