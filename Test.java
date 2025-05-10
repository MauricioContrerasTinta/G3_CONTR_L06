import actividad2.Queue;
import actividad2.QueueLink;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> colaEnteros = new QueueLink<>();

        colaEnteros.enqueue(10);
        colaEnteros.enqueue(20);
        colaEnteros.enqueue(30);
    }
}
