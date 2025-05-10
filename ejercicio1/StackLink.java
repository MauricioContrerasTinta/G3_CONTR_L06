package ejercicio1;
import actividad1.Stack; //usamos la misma interfaz Stack de la actividad 1
import actividad1.ExceptionIsEmpty;

class Node<E> {
    E dato;               
    Node<E> siguiente;    
    public Node(E dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class StackLink {
    
}
