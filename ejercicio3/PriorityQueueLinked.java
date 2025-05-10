package ejercicio3;
import actividad2.Queue;
import actividad2.QueueLink;
import actividad1.ExceptionIsEmpty;

public class PriorityQueueLinked<E> implements PriorityQueue<E> {
    private Queue<E>[] colas; //arreglo de colas
    private int niveles; //cantidad de prioridades

    public PriorityQueueLinked(int niveles) {
        this.niveles = niveles;
        this.colas = new Queue[niveles];
        for (int i = 0; i < niveles; i++) {
            this.colas[i] = new QueueLink<E>(); //se inicializa cada cola como una lista enlazada
        }
    }
}
