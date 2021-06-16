import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.DoubleConsumer;

public class Doctor {
    public enum Day{
        SUNDAY("Domingo"),
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado");
    private String spanish;
        Day(String s){
            spanish = s;
        }
        private String getSpanish(){
            return spanish;
        }
    }
    private static int id = 0; //Autoincrement
    private String name;
    private String speciality;

    public Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    public Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " +name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvaiableAppointment> avaiableAppointments = new ArrayList<>();
    public void addAvaiableAppointment(Date date, String time){
        avaiableAppointments.add(new Doctor.AvaiableAppointment(date,time));
    }
    public ArrayList<AvaiableAppointment> getAvaiableAppointments(){
        return avaiableAppointments;
    }

    //Subclase para agendar citas
    public static class AvaiableAppointment{
        //Avaiable Appointment
        private int id_avaiable_appointment;
        private Date date;
        private String time;

        public AvaiableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_avaiable_appointment() {
            return id_avaiable_appointment;
        }

        public void setId_avaiable_appointment(int id_avaiable_appointment) {
            this.id_avaiable_appointment = id_avaiable_appointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
