package bytebuddy;

public interface Morphing<T> {
    T invoke(Object[] args);
}


