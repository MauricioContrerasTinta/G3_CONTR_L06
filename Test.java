import actividad3.PriorityQueue;
import actividad3.PriorityQueueLinkSort;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer, Integer> colaPrioridad = new PriorityQueueLinkSort<>();

        colaPrioridad.enqueue(10, 2);
        colaPrioridad.enqueue(20, 1); 
        colaPrioridad.enqueue(30, 3);
    }
}
