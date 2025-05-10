import zaplicacion.Application;

public class Test {
    public static void main(String[] args) {
        System.out.println(Application.symbolBalancing("()()()[()]()")); //true
        System.out.println(Application.symbolBalancing("((()))[]"));     //true
        System.out.println(Application.symbolBalancing("([])[]("));      //false
        System.out.println(Application.symbolBalancing("([{)]}"));       //false
        System.out.println(Application.symbolBalancing("["));            //false
        System.out.println(Application.symbolBalancing("[][][]{{{}}}")); //true
    }
}
