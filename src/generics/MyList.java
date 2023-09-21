package generics;

/**
 * MyList
 */
public class MyList<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
    
}