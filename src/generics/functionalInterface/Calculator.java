package generics.functionalInterface;

/**
 * Calculator
 */
public interface Calculator<T>{
    T perform(T n1, T n2);
}