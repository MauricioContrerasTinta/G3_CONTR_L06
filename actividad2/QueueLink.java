package actividad2;
import actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {

    private Node<E> primero; 
    private Node<E> ultimo;
    
    public QueueLink() {
        this.primero = null;
        this.ultimo = null;
    }

    public void enqueue(E elemento) {
        Node<E> nuevo = new Node<>(elemento);
        if (this.isEmpty()) {
            this.primero = nuevo;
        } else {
            this.ultimo.setNext(nuevo);
        }
        this.ultimo = nuevo;
    }
}
