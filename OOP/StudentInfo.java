public class StudentInfo {
    String name ;
    long rollno;


    public static void main(String[] args) {
        
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();

        s1.name = "Rohith";
        s1.rollno = 73152526048l;

        s2.name = "Arun";
        s1.rollno = 123456789l;

        System.out.println(s1.name);
    }
}
