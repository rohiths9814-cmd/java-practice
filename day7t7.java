public class day7t7 {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }

        return fact;
    }

    public static void main(String[] args){
        int number=5;
        int result=fact(number);
        System.out.print("The factorial is: "+result);
    }
}
