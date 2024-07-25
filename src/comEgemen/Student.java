package comEgemen;

public class Student extends Human {
    private String studentId;
    private Course[] courses;
    private int courseCount;

    public Student(String name, int age, String gender, String studentId, int maxCourses) {
        super(name, age, gender);
        this.studentId = studentId;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            this.courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("Course array is full.");
        }
    }
}
