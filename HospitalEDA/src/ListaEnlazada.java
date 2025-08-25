import java.util.PriorityQueue;
public class ListaEnlazada {
    NodoArbol inicio;
    public ListaEnlazada() {
        this.inicio = null;
    }
    PriorityQueue<Paciente> colaPrioridad = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getPrioridad(), p1.getPrioridad()));
    public void insertarPaciente(Paciente nuevoPaciente){
        colaPrioridad.add(nuevoPaciente);
    }
    public Paciente atenderPaciente(){
        return colaPrioridad.poll();
    }
    public void eliminarPaciente(Paciente pacienteEliminar){
        colaPrioridad.remove(pacienteEliminar);
    }
    public void cambiarPrioridad(Paciente paciente, int nuevaPrioridad){
        this.eliminarPaciente(paciente);
        paciente.setPrioridad(nuevaPrioridad);
        this.insertarPaciente(paciente);
    }
}
