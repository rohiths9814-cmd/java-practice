class Animal {

    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

public class Zoo {
    public static void main(String[] args) {
        
        Animal cat = new Animal();
        cat.name = "cat";
        cat.age = 1;
        cat.makeSound();
    }
}