class Animal {

    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    String breed;

    void makeSound(){
        System.out.println("Dogs barks");
    }
}

public class Zoo {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.name = "Timmy";
        System.out.println(d1.name);
        d1.makeSound();
    }
}