package comEgemen;

public class Principal extends Teacher {
    private String officeNumber;

    public Principal(String name, int age, String gender, String employeeId, int maxMajors, String officeNumber) {
        super(name, age, gender, employeeId, maxMajors);
        this.officeNumber = officeNumber;
    }

    // Getters and Setters
    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
