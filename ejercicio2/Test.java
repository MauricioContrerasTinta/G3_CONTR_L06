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

        try {
            System.out.println("Elemento eliminado: " + colaEnteros.dequeue());
            System.out.println("Elemento al frente: " + colaEnteros.front());
            System.out.println("Elemento al final: " + colaEnteros.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cola final: " + colaEnteros);

        Queue<String> colaStrings = new QueueArray<>(3);
        colaStrings.enqueue("uno");
        colaStrings.enqueue("dos");

        System.out.println("Cola de Strings: " + colaStrings);
    }
}
