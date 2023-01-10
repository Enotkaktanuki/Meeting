import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private LocalDate dateOfBith;
    private String gender;

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public LocalDate getdateOfBith() {
        return dateOfBith;
    }
    public void setdateOfBith(LocalDate dateOfBith) {
        this.dateOfBith = dateOfBith;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(String name, LocalDate dateOfBith, String gender) {
        this.name = name;
        this.dateOfBith = dateOfBith;
        this.gender = gender;
    }

    public int getAge() {
        return LocalDate.now().getYear() -dateOfBith.getYear();
    }

    public abstract void describeResponsibilities();
}
