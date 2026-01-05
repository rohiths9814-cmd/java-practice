
class Parent {

    int money;
    String property;
    int house;

    Parent(int mon, String property){
        this.money = mon;
        this.property = property;
    }
    Parent(int mon, String property,int house){
        this.money = mon;
        this.property = property;
        this.house = house;
    }
    Parent(){
        this.money = 0;
        this.property = "Null";
        this.house = 0 ;
    }
}

public class mainclass {

    public static void main(String[] args) {
        
        Parent p1 = new Parent(1000,"land");
        Parent p2 = new Parent();
        Parent p3 = new Parent(100000 , "50 acre land" , 10);
        Parent p4 = p3;

        System.out.println("Money value of p1 is " + p1.money);
        System.out.println("Money value of p2 is " + p2.money);
        System.out.println("Money value of p3 is " + p3.money);
        System.out.println("Money value of p4 is " + p4.money);


    }
}