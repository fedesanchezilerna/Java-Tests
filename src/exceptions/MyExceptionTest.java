package exceptions;

public class MyExceptionTest {

    public static void main(String[] args) {
        try {
            raiseError0();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally 0");
        }
        try {
            raiseError1();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally 1");
        }
        try {
            raiseError2();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally 2");
        }
    }

    private static void raiseError0() throws MyException {
        throw new MyException(MyException.ERROR_0);
    }

    private static void raiseError1() throws MyException {
        throw new MyException(MyException.ERROR_1);
    }

    private static void raiseError2() throws MyException {
        throw new MyException(MyException.ERROR_2);
    }
}
