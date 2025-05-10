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
}
