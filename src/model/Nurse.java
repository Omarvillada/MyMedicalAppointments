package model;

public class Nurse extends User{

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
        System.out.println("El nombre del enfermero es: "+ name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz verde");
        System.out.println("Departamento: Nutriología");
    }
}

