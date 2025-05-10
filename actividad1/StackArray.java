package actividad1;

public class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    
    public StackArray(int n){
        this.array = (E[]) new Object[n];
        this.tope = -1;
    }

    public void push(E x){
        if (!isFull()) {
            array[++tope] = x;
        } else {
            System.out.println("Stack esta lleno " + x);
        }
    }
}
