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

    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacia, no se puede eliminar.");
        }
        E dato = this.primero.getData();
        this.primero = this.primero.getNext();
        
        if (this.primero == null) {
            this.ultimo = null;
        }

        return dato;
    }

    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacia, no hay frente.");
        }
        return this.primero.getData();
    }

    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía. No hay último.");
        }
        return this.ultimo.getData();
    }

    public boolean isEmpty() {
        return this.primero == null;
    }
}
