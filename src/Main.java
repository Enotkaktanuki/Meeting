import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Employee pm = new PM("Tima", LocalDate.of(1995,1,29),"Male", PM.Job.PROGRAMMER);
        Employee pm2 = new CEO("Nura",LocalDate.of(2002,9,8),"Female", CEO.Cars.MD);
        Employee dev = new Developer("Rama",LocalDate.of(2001,11,22),"Male", Developer.Pl.JAVA);

        Meeting meeting1 = new Meeting(LocalDateTime.of(2008, 1, 27, 6, 5), 5, new ArrayList<>(Arrays.asList(pm,pm2,dev)), Meeting.Status.END);
        System.out.println(meeting1);
        for (Employee emp:meeting1.attendees) {
            System.out.printf("\nИмя: %s \nПол: %s \nВозраст: %d \n",emp.getname(),emp.getGender(), emp.getAge());
        }

        Meeting meeting2 = new Meeting(LocalDateTime.of(2023,6,25,5,10), 6,new ArrayList<>(Arrays.asList(pm,pm2,dev)), Meeting.Status.ONGOING);
        System.out.println(meeting2);
        for (Employee emp2:meeting2.attendees){
            System.out.printf("\nИмя: %s \nПол: %s \nВозраст: %d \n",emp2.getname(),emp2.getGender(), emp2.getAge());
        }
        meeting1.compareTime(new ArrayList<>(Arrays.asList(meeting1,meeting2)));

    }
}