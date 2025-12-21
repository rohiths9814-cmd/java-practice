public class day7t4 {
    public static int max(int a,int b,int c){
        if(a>b && a>c){
            System.out.print(a);
        }
        else if(b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }

        return 0;
    }

    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;

        max(a,b,c);
    }
}
