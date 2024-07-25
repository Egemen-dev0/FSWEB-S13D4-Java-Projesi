package comEgemen;

public class Teacher extends Human {
    private String employeeId;
    private Major[] majors;
    private int majorCount;

    public Teacher(String name, int age, String gender, String employeeId, int maxMajors) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.majors = new Major[maxMajors];
        this.majorCount = 0;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Major[] getMajors() {
        return majors;
    }

    public void addMajor(Major major) {
        if (majorCount < majors.length) {
            this.majors[majorCount] = major;
            majorCount++;
        } else {
            System.out.println("Major array is full.");
        }
    }
}
