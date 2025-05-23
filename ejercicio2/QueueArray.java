package ejercicio2;

import actividad2.Queue; // Se usa la misma interfaz de la actividad 2
import actividad1.ExceptionIsEmpty;

public class QueueArray<E> implements Queue<E> {
    private E[] arreglo;
    private int primero;
    private int ultimo;
    private int tamaño;
    private int capacidad;

    public QueueArray(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = (E[]) new Object[capacidad];
        this.primero = 0;
        this.ultimo = 0;
        this.tamaño = 0;
    }

    public void enqueue(E elemento) {
        if (tamaño == capacidad) {
            System.out.println("Cola llena, no se puede insertar.");
            return;
        }
        arreglo[ultimo] = elemento;
        ultimo = (ultimo + 1) % capacidad;
        tamaño++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía. No se puede eliminar.");
        }
        E elemento = arreglo[primero];
        primero = (primero + 1) % capacidad;
        tamaño--;
        return elemento;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacia");
        }
        return arreglo[primero];
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía.");
        }
        int pos = (ultimo - 1 + capacidad) % capacidad;
        return arreglo[pos];
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamaño; i++) {
            int indice = (primero + i) % capacidad;
            sb.append(arreglo[indice]);
            if (i < tamaño - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
