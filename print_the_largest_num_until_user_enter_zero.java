import java.util.Scanner;

public class print_the_largest_num_until_user_enter_zero {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int value;
        int max=2;

        while(true){
            
            value=in.nextInt();
            if(value == 0){
                break;
            }
            else{
                if(value>max){
                    max=value;
                }
            }
        }

        System.out.print(max);
    }
}
