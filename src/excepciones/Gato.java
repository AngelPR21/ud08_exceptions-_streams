package excepciones;

public class Gato {


    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws ExcepcionGatuna{
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
        if(edad<0){
            throw new ExcepcionGatuna("Edad negativa");
        }
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionGatuna{
        this.nombre = nombre;
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionGatuna {
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
