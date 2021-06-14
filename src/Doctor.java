import java.util.function.DoubleConsumer;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    public Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    public Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
}
