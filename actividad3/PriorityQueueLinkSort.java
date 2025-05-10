package actividad3;
import actividad1.ExceptionIsEmpty;

public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    class EntryNode {
        E data;  // Dato del elemento
        N priority;  // Prioridad del elemento

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private Node<EntryNode> primero;
    private Node<EntryNode> ultimo;
    
    public PriorityQueueLinkSort() {
        this.primero = null;
        this.ultimo = null;
    }

    public void enqueue(E x, N pr) {
        EntryNode nuevo = new EntryNode(x, pr);  //creamos el nuevo nodo con dato y prioridad
        Node<EntryNode> nodoNuevo = new Node<>(nuevo);  //nodo con el nuevo EntryNode

        if (this.isEmpty()) {
            this.primero = nodoNuevo;
            this.ultimo = nodoNuevo;
        } else {
            Node<EntryNode> actual = this.primero;
            Node<EntryNode> anterior = null;

            while (actual != null && actual.getData().priority.compareTo(pr) >= 0) {
                anterior = actual;
                actual = actual.getNext();
            }

            if (anterior == null) {
                nodoNuevo.setNext(this.primero);
                this.primero = nodoNuevo;
            } else {
                anterior.setNext(nodoNuevo);
                nodoNuevo.setNext(actual);
            }

            if (nodoNuevo.getNext() == null) {
                this.ultimo = nodoNuevo;
            }
        }
    }
    
    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("no se puede eliminar de una cola vacía");
        }

        E dato = this.primero.getData().data;  // Guardamos el dato del frente
        this.primero = this.primero.getNext(); // Movemos el frente de la cola

        if (this.primero == null) {
            this.ultimo = null;
        }
        return dato;
    }

    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía. No hay frente.");
        }
        return this.primero.getData().data;
    }

    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía. No hay último.");
        }
        return this.ultimo.getData().data;
    }

    public boolean isEmpty() {
        return this.primero == null;
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        Node<EntryNode> actual = this.primero;

        while (actual != null) {
            resultado.append(actual.getData().data);
            if (actual.getNext() != null) {
                resultado.append(" -> ");
            }
            actual = actual.getNext();
        }

        return resultado.toString();
    }
}
