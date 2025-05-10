import actividad3.PriorityQueue;
import actividad3.PriorityQueueLinkSort;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer, Integer> colaPrioridad = new PriorityQueueLinkSort<>();

        colaPrioridad.enqueue(10, 2);
        colaPrioridad.enqueue(20, 1); 
        colaPrioridad.enqueue(30, 3);

        System.out.println("Cola de prioridad: " + colaPrioridad);
        
        try {
  
            System.out.println("Frente: " + colaPrioridad.front()); 
            System.out.println("Final: " + colaPrioridad.back()); 


            int eliminado = colaPrioridad.dequeue();
            System.out.println("Elemento eliminado: " + eliminado); 


            System.out.println("Cola después de eliminar: " + colaPrioridad); 

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
