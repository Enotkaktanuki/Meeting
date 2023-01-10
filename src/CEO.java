import java.time.LocalDate;

public class CEO extends Employee{

   Cars cars;

    public CEO(String name, LocalDate dateOfBith, String gender, Cars cars) {
        super(name, dateOfBith, gender);
        this.cars = cars;
    }

    @Override
    public void describeResponsibilities() {
        System.out.println("Машина которую водит Ген.дир. это :"+ cars);
    }

    public enum Cars{
       MD,
       AUDI,
       HONDA,
       BENTLEY;
    }

}
