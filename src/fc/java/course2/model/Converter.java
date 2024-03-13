package fc.java.course2.model;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
