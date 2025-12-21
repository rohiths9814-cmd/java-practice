import java.util.Scanner;

public class day6t4 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");   
        String str=sc.nextLine();

        System.out.print("Char: ");
        char c=sc.next().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch == c){
                count+=1;
            }
        }

        System.out.print("Frequency = "+count);
    }
}
