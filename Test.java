import ejercicio2.QueueArray;
import actividad2.Queue;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> colaEnteros = new QueueArray<>(5);
        colaEnteros.enqueue(10);
        colaEnteros.enqueue(20);
        colaEnteros.enqueue(30);

        System.out.println("Cola actual: " + colaEnteros);
    }
}
