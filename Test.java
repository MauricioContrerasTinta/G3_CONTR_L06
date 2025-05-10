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
    }
}
