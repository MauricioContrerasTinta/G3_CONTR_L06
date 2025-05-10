import actividad2.Queue;
import actividad2.QueueLink;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> colaEnteros = new QueueLink<>();

        colaEnteros.enqueue(10);
        colaEnteros.enqueue(20);
        colaEnteros.enqueue(30);

        System.out.println("Cola de enteros: " + colaEnteros);

        try {

            System.out.println("Frente: " + colaEnteros.front());
            System.out.println("Final: " + colaEnteros.back());

            int eliminado = colaEnteros.dequeue();
            System.out.println("Elemento eliminado: " + eliminado);

            System.out.println("Cola después de eliminar: " + colaEnteros);
            
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
