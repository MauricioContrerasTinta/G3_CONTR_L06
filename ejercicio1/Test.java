import ejercicio1.StackLink;
import actividad1.Stack;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> pilaEnteros = new StackLink<>();
        pilaEnteros.push(10); 
        pilaEnteros.push(20); 
        pilaEnteros.push(30); 
        
        System.out.println("Pila de enteros: " + pilaEnteros);

        try {
            System.out.println("Elemento tope: " + pilaEnteros.top());  //debe mostrar 30
            System.out.println("Elemento desapilado: " + pilaEnteros.pop()); //elimina 30
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pila despues de pop: " + pilaEnteros);

        Stack<String> pilaCadenas = new StackLink<>();
        pilaCadenas.push("uno");
        pilaCadenas.push("dos");
        pilaCadenas.push("tres");

        System.out.println("Pila de cadenas: " + pilaCadenas);

        try {
            while (!pilaCadenas.isEmpty()) {
                System.out.println("Desapilando: " + pilaCadenas.pop());
            }
            pilaCadenas.pop(); //forzamos la excepción
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
