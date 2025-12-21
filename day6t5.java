import java.util.Scanner;

public class day6t5 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for(String w : words){
            String rev=new StringBuilder(w).reverse().toString();

            result += rev + " ";
        }
        System.out.print(result.trim());
    }
}
