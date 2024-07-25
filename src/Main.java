import com.project.superhuman.Human;
import com.students.*;
import comEgemen.Course;
import comEgemen.Major;
import comEgemen.Principal;
import comEgemen.Student;
import comEgemen.Teacher;

public class Main {
    public static void main(String[] args) {

      /*  Human insanEgo = new Human();
        Human insanGokalp = new Human(2);
        Human humanElif  = new Human(3);


        System.out.println(insanEgo.getCityInfo());

        insanGokalp.getCityValue();
        System.out.println(insanGokalp.getCityInfo());
        insanGokalp.run(10);
        insanGokalp.run(100);


        System.out.println("Bu insan bu kadar koştu : "+ insanGokalp.runnerMeterValue());
*/
        Teacher teacher1 = new Teacher("John Doe", 40, "Male", "T123", 5);
        Major computerScience = new Major("Computer Science", teacher1, 10);

        comEgemen.Student student1 = new comEgemen.Student("Alice Smith", 20, "Female", "S456", 5);
        comEgemen.Student student2 = new comEgemen.Student("Bob Brown", 22, "Male", "S789", 5);

        computerScience.addStudent(student1);
        computerScience.addStudent(student2);

        Course javaProgramming = new Course("Java Programming", teacher1, 10);
        javaProgramming.enrollStudent(student1);
        javaProgramming.enrollStudent(student2);

        Principal principal = new Principal("Jane Smith", 50, "Female", "P001", 5, "Office 101");

        // Output the major details
        System.out.println("Major: " + computerScience.getName());
        System.out.println("Teacher: " + computerScience.getTeacher().getName());
        System.out.println("Students: ");
        for (comEgemen.Student student : computerScience.getStudents()) {
            if (student != null) {
                System.out.println("- " + student.getName());
            }
        }

        // Output the course details
        System.out.println("Course: " + javaProgramming.getCourseName());
        System.out.println("Teacher: " + javaProgramming.getTeacher().getName());
        System.out.println("Enrolled Students: ");
        for (Student student : javaProgramming.getEnrolledStudents()) {
            if (student != null) {
                System.out.println("- " + student.getName());
            }
        }

        // Output the principal details
        System.out.println("Principal: " + principal.getName());
        System.out.println("Office Number: " + principal.getOfficeNumber());
    }


    }