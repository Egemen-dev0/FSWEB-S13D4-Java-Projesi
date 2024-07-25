package comEgemen;

public class CleaningWorker extends Human {
    private String shift;

    public CleaningWorker(String name, int age, String gender, String shift) {
        super(name, age, gender);
        this.shift = shift;
    }

    // Getters and Setters
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}

