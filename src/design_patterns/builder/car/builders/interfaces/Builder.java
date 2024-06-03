package design_patterns.builder.car.builders.interfaces;

public interface Builder<T> {
    public void reset();
    public T build();
}
