import java.time.LocalDate;

public class Developer extends Employee{

    Pl pl;
    public Developer(String name, LocalDate dateOfBith, String gender,Pl pl) {
        super(name, dateOfBith, gender);
        this.pl=pl;
    }

    @Override
    public void describeResponsibilities() {
        System.out.println("Язык этого разработчика :"+ pl);
    }

    public enum Pl{
        JAVA,
        PYTHON,
        JAVASCRIPT,
        PASCAL,
        RUST;
    }


}
