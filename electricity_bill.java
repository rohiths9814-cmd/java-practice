import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter units: ");
        int units =in.nextInt();

        double amount=0;
        int fixed_charge = 50;

        if(units<=100){
            amount = units*5;
        }
        else if(units<=200){
            amount = 100*5 + (units-100)*2.50;
        }
        else if(units<=300){
            amount = (100*5)+(100*2.50)+((units-200)*4);
        }
        else {
            amount = (100*5)+(100*2.50)+(100*4)+(units-300)*6;
        }

        double subtotal = amount +fixed_charge;

        double extra_charge=0;

        if(subtotal>500){
            extra_charge = subtotal*0.10;
        }

        double tax= (subtotal+extra_charge)*0.05;

        double total = subtotal+tax+extra_charge;

        System.out.print("The total electricity bill for " + units + " units is " + total);

    }
}
