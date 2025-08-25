public class Arbol {
    NodoArbol raiz;
    public Arbol(){
        this.raiz=null;
    }
    public void insertar(Paciente nuevoPaciente){
        if(this.raiz==null){
            this.raiz=new NodoArbol(nuevoPaciente);
        }
        else{
            this.raiz.insertarValor(nuevoPaciente);
        }
    }
    public void eliminarPaciente(Paciente quitarPaciente){
        if(this.raiz!=null&&quitarPaciente!=this.raiz.getPaciente()){
            this.raiz.quitarPaciente(quitarPaciente);
        }
    }
    public void cambiarPrioridad(Paciente paciente, int nuevaPrioridad){
        if(this.raiz!=null){
            this.eliminarPaciente(paciente);
            paciente.setPrioridad(nuevaPrioridad);
            this.insertar(paciente);
        }
    }
}
