import java.time.LocalDateTime;
import java.util.List;

public class Meeting {
    LocalDateTime dateTime;
    int durationInHours;
    List<Employee> attendees;
    Status status;

    public Meeting(LocalDateTime dateTime, int durationInHours, List<Employee> attendees, Status status) {
        this.dateTime = dateTime;
        this.durationInHours = durationInHours;
        this.attendees = attendees;
        this.status = status;
    }



    enum Status{
        ONGOING,
        CARRY,
        REPEAL,
        END;
    }
    public void reschedule(LocalDateTime newDateTime) {
        this.dateTime = newDateTime;
    }

    public void compareTime(List<Meeting> meetings) {
        for (Meeting meeting : meetings) {
            if (this.dateTime.isBefore(meeting.dateTime)) {
                System.out.println("\nЭто встреча начнется раньше других встречь.");
            } else if (this.dateTime.isAfter(meeting.dateTime)) {
                System.out.println("\nЭто встреча начнется после других встречь. ");
            } else {
                System.out.println("\nЭта встреча начинается в то же время что и остальные.");
            }
        }
    }

    @Override
    public String toString() {
        return "\nВстреча: " +
                "\nДата: " + dateTime +
                "\nДлительность: " + durationInHours +
                "\nСтатус: " + status ;
    }

}