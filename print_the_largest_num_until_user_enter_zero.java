import java.util.Scanner;

public class print_the_largest_num_until_user_enter_zero {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int value=in.nextInt();
        int max=value;

        while(value != 0){
            
            if(value>max){
                max=value;
           }
           value=in.nextInt();
        }

        System.out.print(max);
    }
}
