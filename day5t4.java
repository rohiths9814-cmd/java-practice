import java.util.Scanner;

public class day5t4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[]arr = {10,20,30,40,50};
        
        System.out.print("Enter Key: ");
        int key=sc.nextInt();

        boolean found=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                found=true;
                break;
            }
        }

        if(found){
            System.out.print("Found");
        }
        else{
            System.out.print("Not found");
        }

    }
}
