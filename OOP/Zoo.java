class Animal {

    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    String breed;

}

public class Zoo {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.name = "Timmy";
        System.out.println(d1.name);
    }
}