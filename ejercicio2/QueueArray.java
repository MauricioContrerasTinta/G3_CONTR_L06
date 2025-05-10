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
}
