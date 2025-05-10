import ejercicio3.PriorityQueue;
import ejercicio3.PriorityQueueLinked;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> cola = new PriorityQueueLinked<>(3);

        cola.enqueue("Pago urgente", 0);
        cola.enqueue("Correo", 2);
        cola.enqueue("Llamada", 1);
        cola.enqueue("Reunión", 1);

        System.out.println(cola.toString());

        try {
            //prueba de front y back
            System.out.println("Primero: " + cola.front());
            System.out.println("Último: " + cola.back());
        }
    }
}
