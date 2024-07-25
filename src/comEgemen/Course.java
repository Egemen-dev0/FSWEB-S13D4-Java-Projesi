package comEgemen;

public class Course {
    private String courseName;
    private Teacher teacher;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(String courseName, Teacher teacher, int maxStudents) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new Student[maxStudents];
        this.studentCount = 0;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            this.enrolledStudents[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Enrolled students array is full.");
        }
    }
}
