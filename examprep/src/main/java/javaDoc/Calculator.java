package javaDoc;

/**
 * The {@code Calculator} class provides basic arithmetic operations.
 * <p>
 * This class demonstrates the main parts of Javadoc, including class-level,
 * field-level, and method-level documentation.
 * </p>
 *
 * <p><strong>Example Usage:</strong></p>
 * <pre>
 * Calculator calculator = new Calculator();
 * int sum = calculator.add(5, 3); // Returns 8
 * int product = calculator.multiply(4, 2); // Returns 8
 * </pre>
 *
 * @author Your Name
 * @version 1.0
 */
public class Calculator {

    /**
     * The name of the calculator.
     */
    private String name;

    /**
     * Constructs a {@code Calculator} object with a default name.
     */
    public Calculator() {
        this.name = "Simple Calculator";
    }

    /**
     * Gets the name of the calculator.
     *
     * @return the name of the calculator
     */
    public String getName() {
        return name;
    }

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of {@code a} and {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Multiplies two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of {@code a} and {@code b}
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers and returns the result.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of {@code a} divided by {@code b}
     * @throws ArithmeticException if {@code b} is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}