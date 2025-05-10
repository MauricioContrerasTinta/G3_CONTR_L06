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

    public void enqueue(E elemento, int prioridad) {
        if (prioridad < 0 || prioridad >= niveles) return;
        colas[prioridad].enqueue(elemento);
    }

    public E dequeue() throws ExceptionIsEmpty {
        for (int i = 0; i < niveles; i++) {
            if (!colas[i].isEmpty()) {
                return colas[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacia");
    }

    public E front() throws ExceptionIsEmpty {
        for (int i = 0; i < niveles; i++) {
            if (!colas[i].isEmpty()) {
                return colas[i].front();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacía");
    }

    public E back() throws ExceptionIsEmpty {
        for (int i = niveles - 1; i >= 0; i--) {
            if (!colas[i].isEmpty()) {
                return colas[i].back();
            }
        }
        throw new ExceptionIsEmpty("Cola de prioridad vacía");
    }

    public boolean isEmpty() {
        for (int i = 0; i < niveles; i++) {
            if (!colas[i].isEmpty()) return false;
        }
        return true;
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < niveles; i++) {
            resultado += "Prioridad " + i + ": " + colas[i].toString() + "\n";
        }
        return resultado;
    }
}
