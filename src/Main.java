import javax.print.Doc;

import java.util.Date;

import static  ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Omar Villada", "Programación");
        Doctor.Day allDays [] = Doctor.Day.values();
        for (Doctor.Day d:allDays
             ) {
            System.out.println(d);
        }


        myDoctor.addAvaiableAppointment(new Date(),"12PM");
        myDoctor.addAvaiableAppointment(new Date(),"2PM");
        myDoctor.addAvaiableAppointment(new Date(),"3PM");

        for (Doctor.AvaiableAppointment aA: myDoctor.getAvaiableAppointments()
             ) {
            System.out.println(aA.getDate() + " "+ aA.getTime());
        }

        Patient patient = new Patient("ALejandra", "alejandra@gmail.com");
        patient.setWeight(60.0);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }


}
