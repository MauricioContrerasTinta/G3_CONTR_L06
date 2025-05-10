package actividad2;
import actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {

    private Node<E> primero; 
    private Node<E> ultimo;
    
    public QueueLink() {
        this.primero = null;
        this.ultimo = null;
    }
    
}
