package ejercicio3;
import actividad2.Queue;
import actividad2.QueueLink;
import actividad1.ExceptionIsEmpty;

public class PriorityQueueLinked<E> implements PriorityQueue<E> {
    private Queue<E>[] colas; //arreglo de colas
    private int niveles; //cantidad de prioridades
}
