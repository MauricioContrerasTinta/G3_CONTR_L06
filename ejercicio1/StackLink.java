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

public class StackLink<E> implements Stack<E> {
    private Node<E> cima;

    public StackLink() {
        this.cima = null;
    }

    public void push(E x) {
        Node<E> nuevo = new Node<>(x);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("La pila está vacía");
        E dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("La pila está vacía");
        return cima.dato;
    }
}
