import java.util.Scanner;

public class day6t3 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        int count=1;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch == ' ' ){
                count+=1;
            }
        }

        System.out.println("Words = "+count);
    }
}
