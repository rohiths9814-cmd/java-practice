public class Student {
    String name;
    int rollno;
    int marks;

    Student(String name,int rollno,int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public static void main(String[] args){
        // Student s1 = new Student("Rohith" , 48 , 100);

        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
        // System.out.println(s1.marks);

        // Student s2 = new Student("Arun" , 2 , 92);

        // System.out.println(s2.name);
        // System.out.println(s2.rollno);
        // System.out.println(s2.marks);

        // s1.show();
        // s2.show();

        // Student a = new Student("Rohith", 48, 100);

        // Student b = a;

        // b.marks = 50;

        // System.out.println(a.marks);

        int a = 10;
        changePrimitive(a);
        System.out.println(a);

        Student s = new Student("Rohith", 48, 100);
        changeObject(s);
        System.out.println(s.marks);

    }

    // void show() {
    //     System.out.println(this);
    // }

    static void changePrimitive(int x){
        x = 99;
    }

    static void changeObject(Student s){
        s.marks = 99;
    }

}