class Vehicle {

    String brand;
    int year;

    void startEngine(){
        System.out.println("Engine is started");
    }
}

class Car extends Vehicle {
    String fueltype;

    void startEngine(){
        System.out.println("Car engine starts");
    }

    void drive(){
        System.out.println("Car is driving");
    }
}

class Truck extends Vehicle {
    int loadcapacity;

    void startEngine(){
        System.out.println("Truck engine starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}



public class Main {
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.year = 1;
        c1.fueltype = "Petrol";
        c1.startEngine();
        c1.drive();

        Truck t1 = new Truck();
        t1.brand = "Volvo";
        t1.year = 2;
        t1.loadcapacity = 10000;
        t1.startEngine();
        t1.haul();
    }
}
