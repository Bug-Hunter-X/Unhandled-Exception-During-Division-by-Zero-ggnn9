public class UncommonErrorExampleSolution {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            e.printStackTrace(); // For debugging purposes
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
} 