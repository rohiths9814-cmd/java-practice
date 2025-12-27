public class stringBuilder {
    public static void main(String[] args) {

        String example = "Welcome";
        
        StringBuilder demo = new StringBuilder();

        for (int i = example.length() - 1; i >=0; i--) {
            demo.append(example.charAt(i));
        }

        System.out.print(demo);
    }
}
