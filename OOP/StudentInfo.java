public class StudentInfo {
    String name ;
    long rollno;


    public static void main(String[] args) {
        
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = s1;

        s1.name = "Rohith";
        s1.rollno = 73152526048l;

        System.out.println(s2.name);
    }
}
