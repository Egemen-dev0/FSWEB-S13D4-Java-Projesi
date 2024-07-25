package comEgemen;

public class Major {
    private String name;
    private Teacher teacher;
    private Student[] students;
    private int studentCount;

    public Major(String name, Teacher teacher, int maxStudents) {
        this.name = name;
        this.teacher = teacher;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            this.students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Student array is full.");
        }
    }
}
