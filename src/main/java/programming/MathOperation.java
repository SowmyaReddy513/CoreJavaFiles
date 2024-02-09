package programming;
//Create a functional interface called MathOperation with a single method int operate(int a, int b). Implement this interface using a lambda expression to perform addition.
@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);
}
