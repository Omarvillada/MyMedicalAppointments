import java.util.function.DoubleConsumer;

public class Doctor {
    int id;
    String name;
    String speciality;

    public Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }
    public Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }
}
