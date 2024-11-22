package classroom;

public class Persona {

    public long cedula; //se quita el final
    public String nombre;
    public static int totalPersonas;
    //se elimina ya que genera problemas y no es necesario
    public Persona(){     //Faltaba el constructor sin parametros
        this.cedula = 0;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
