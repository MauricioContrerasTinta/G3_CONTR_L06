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
        EntryNode nuevo = new EntryNode(x, pr); 
        Node<EntryNode> nodoNuevo = new Node<>(nuevo);
    } 
}
