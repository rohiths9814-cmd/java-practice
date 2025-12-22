import java.util.Scanner;

public class sum_of_digits_until_user_press_0 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int sum=0;

        while(true){
            int value = in.nextInt();
            if(value==0){
                break;
            }
            else{
                sum+=value;
            }

        }

        System.out.println(sum);
    }
}
