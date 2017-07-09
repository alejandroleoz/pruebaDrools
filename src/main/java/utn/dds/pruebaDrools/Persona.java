package utn.dds.pruebaDrools;

public class Persona {

    private int edad;
    private String nombre;
    private boolean isMayor = false;
    private Auto auto;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, Auto auto) {
        this(nombre, edad);
        this.auto = auto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMayor() {
        return isMayor;
    }

    public void setMayor(boolean mayor) {
        isMayor = mayor;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

}
