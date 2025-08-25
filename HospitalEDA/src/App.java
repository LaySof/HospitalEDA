import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Random random = new Random();
        Paciente lily = new Paciente("Lily","Femenino", 21, 2, 6969);
        int x = 1000;

        //Pruebas con arboles binarios
        long startTime = System.nanoTime();        
        Arbol arbol = new Arbol();
        for(int i=0;i<500;i++){
            Paciente paciente = new Paciente("Nombre","Género", random.nextInt(1,100),random.nextInt(1,10),i);
            arbol.insertar(paciente);
        }
        arbol.insertar(lily);
        for(int i=500;i<x;i++){
            Paciente paciente = new Paciente("Nombre","Género", random.nextInt(1,100),random.nextInt(1,10),i);
            arbol.insertar(paciente);
        }
        long endTime = System.nanoTime();
        long totalTimeNanos = endTime - startTime; 
        
        //Operations timer
        long startTimeA = System.nanoTime();
        arbol.cambiarPrioridad(lily, 9);
        long endTimeA = System.nanoTime();
        long totalTimeNanosA = endTimeA - startTimeA;
        //print
        System.out.println("--------------------------ArbolBinario----------------------------------------------------");
        System.out.println("Execution time for loading in milliseconds: " + totalTimeNanos / 1_000_000.0);
        System.out.println("Execution time for Modify in milliseconds: " + totalTimeNanosA / 1_000_000.0);

        //Pruebas con listas enlazadas
        long startTime2 = System.nanoTime();
        ListaEnlazada lista = new ListaEnlazada();
        for(int i=0;i<x;i++){
            Paciente paciente = new Paciente("Nombre","Género", random.nextInt(1,100),random.nextInt(1,10),i);
            lista.insertarPaciente(paciente);
        }
        long startTimeB = System.nanoTime();
        lista.cambiarPrioridad(lily, 9);
        long endTimeB = System.nanoTime();
        long totalTimeNanosB = endTimeB - startTimeB;

        long endTime2 = System.nanoTime();
        long totalTimeNanos2 = endTime2 - startTime2;
        System.out.println("--------------------------ListaEnlazada----------------------------------------------------");
        System.out.println("Execution time for loading in milliseconds: " + totalTimeNanos2 / 1_000_000.0);
        System.out.println("Execution time for Modify in milliseconds: " + totalTimeNanosB / 1_000_000.0);
    }
}
