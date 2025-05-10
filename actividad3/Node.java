package actividad3;

public class Node<T> {
    private T dato;
    private Node<T> siguiente;

    public Node(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getData() {
        return dato;
    }

    public void setData(T dato) {
        this.dato = dato;
    }

    public Node<T> getNext() {
        return siguiente;
    }

    public void setNext(Node<T> siguiente) {
        this.siguiente = siguiente;
    }
}
