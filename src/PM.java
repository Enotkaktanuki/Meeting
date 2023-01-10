import java.time.LocalDate;

public class PM extends Employee{

    Job job;

    public PM(String name, LocalDate dateOfBith, String gender, Job job) {
        super(name, dateOfBith, gender);
        this.job = job;
    }

    @Override
    public void describeResponsibilities() {
        System.out.println("Специализация данного Проект Менеджера : "+ job);
    }

    enum Job{
        DESIGNER,
        PROGRAMMER,
        COPYRIGHT,
        MARKETER,
        MANAGE;
    }

}
