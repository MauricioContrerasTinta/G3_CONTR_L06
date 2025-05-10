import actividad1.*;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> pilaEnteros = new StackArray<>(5);
        System.out.println("prueba con pila de enteros:");

        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);
        System.out.println("pila actual: " + pilaEnteros);

        try {
            System.out.println("tope: " + pilaEnteros.top());
            System.out.println("pop: " + pilaEnteros.pop());
            System.out.println("pila luego del pop: " + pilaEnteros);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

    }
}
