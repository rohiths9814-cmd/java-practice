
class Parent {

    int money;
    String property;

    Parent(int mon, String property){
        this.money = mon;
        this.property = property;
    }
}

public class mainclass {

    public static void main(String[] args) {
        
        Parent p1 = new Parent(1000,"land");

        System.out.println(p1.money);
        System.out.println(p1.property);
    }
}