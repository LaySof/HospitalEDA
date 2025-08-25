public class Paciente {
    String nombre, genero;
    int edad, prioridad, clave;

    public Paciente(String nombre, String genero, int edad, int prioridad, int clave) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.prioridad = prioridad;
        this.clave = clave;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
