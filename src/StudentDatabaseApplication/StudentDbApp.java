package StudentDatabaseApplication;

public class StudentDbApp {

    public static void main(String[] args) {

  Student st1 = new Student();
 st1.enroll();
 st1.payTuition();
        System.out.println(st1.toString());


    }
}
