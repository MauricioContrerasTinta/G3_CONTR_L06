package zaplicacion;
import ejercicio1.StackLink;
import actividad1.ExceptionIsEmpty;

public class Application {
    StackLink<Character> stack = new StackLink<>();
    for (int i = 0; i < s.length(); i++) {
        char simbolo = s.charAt(i);
        if (simbolo == '(' || simbolo == '[' || simbolo == '{') {
            stack.push(simbolo);
        }
        else if (simbolo == ')' || simbolo == ']' || simbolo == '}') {
            if (stack.isEmpty()) return false;

            try {
                char tope = stack.pop();
                    if (!coincide(tope, simbolo)) return false;
                } catch (ExceptionIsEmpty e) {
                    return false;
                }
            }
    }
    return stack.isEmpty();
}

