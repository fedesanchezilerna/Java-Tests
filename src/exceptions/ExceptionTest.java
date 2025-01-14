package exceptions;

public class ExceptionTest {

    public static void main(String[] args) {
        int power = 0;

        try {
            power = power(2, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Power: " + power);
    }

    public static int power(int base, int exp) throws Exception {
        if (base < 0 || exp < 0) {
            throw new Exception("El exponente o base no pueden ser negativos.");
        }

        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}