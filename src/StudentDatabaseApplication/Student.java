package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance;
    private static int courseCost =1500;
    private static int id = 1000;

    //constructo to prompt user to enter student`s name and year
    public Student(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName=input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName=input.nextLine();

        System.out.println("1-Freshman \n2-Sophmore \n 3-Junior \n4-Senior \nEnter student class level: ");
        this.gradeYear=input.nextInt();

        setStudentId();
        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);


    }
    private void setStudentId(){
    //Grade level + ID
        id++;
        this.studentId=gradeYear+" "+id;
    }
    public void enroll(){
        //Get inside a loop
        do {
            System.out.println("Enter course to enroll(Q to quit)");
            Scanner enter = new Scanner(System.in);
            String course = enter.nextLine();
            if (!course.equals("Q")) {

                course = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                System.out.println("BREAK!");
                break;
            }
        }  while(1 !=0);
        System.out.println("Enrolled in "+courses);
    }

    //view Balance
    public void viewBalance(){

        System.out.println("Your balance is: $"+tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner enter = new Scanner(System.in);
        int payment = enter.nextInt();
    tuitionBalance = tuitionBalance-payment;

        System.out.println("Thank you for your payment of $ "+payment);
        viewBalance();

    }
    //show status
    public String toString(){

        return "Name: "+ firstName+" "+lastName+"\n Courses Enrolled:"+ courses+"\nBalance: $ +tuitionBalance";
    }
}
