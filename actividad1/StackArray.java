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

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Stack is empty. Cannot pop.");
        }
        return array[tope--];
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Stack is empty. Cannot get top.");
        }
        return array[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == array.length - 1;
    }
}
