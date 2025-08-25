public class NodoArbol {
    private Paciente paciente;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Paciente paciente) {
        this.paciente = paciente;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }
    public void insertarValor(Paciente nuevoPaciente){
        if(nuevoPaciente.getPrioridad()<=this.paciente.getPrioridad()){
            if(this.izquierdo==null){
                this.izquierdo=new NodoArbol(nuevoPaciente);
            }
            else{
                this.izquierdo.insertarValor(nuevoPaciente);
            }
        }
        else{
            if(this.derecho==null){
                this.derecho=new NodoArbol(nuevoPaciente);
            }
            else{
                this.derecho.insertarValor(nuevoPaciente);
            }
        }
    }
    public void quitarPaciente(Paciente quitarPaciente){
        if(this.paciente.equals(quitarPaciente)){

            if(this.izquierdo==null && this.derecho==null){
                // No tiene hijos
                this.paciente=null;
            }
            else if(this.izquierdo!=null && this.derecho==null){
                // Solo tiene hijo izquierdo
                this.paciente=this.izquierdo.paciente;
                this.derecho=this.izquierdo.derecho;
                this.izquierdo=this.izquierdo.izquierdo;
            }
            else if(this.izquierdo==null && this.derecho!=null){
                // Solo tiene hijo derecho
                this.paciente=this.derecho.paciente;
                this.izquierdo=this.derecho.izquierdo;
                this.derecho=this.derecho.derecho;
            }
            else{
                // Tiene ambos hijos
                // Encontrar el nodo más pequeño en el subárbol derecho
                NodoArbol minDerecho = this.derecho;
                while(minDerecho.izquierdo != null){
                    minDerecho = minDerecho.izquierdo;
                }
                this.paciente = minDerecho.paciente;
                this.derecho.quitarPaciente(minDerecho.paciente);
            }
        }
        else if(quitarPaciente.getPrioridad()<=this.paciente.getPrioridad()){
            if(this.izquierdo!=null){
                this.izquierdo.quitarPaciente(quitarPaciente);
            }
        }
        else{
            if(this.derecho!=null){
                this.derecho.quitarPaciente(quitarPaciente);
            }
        }
    }

}
