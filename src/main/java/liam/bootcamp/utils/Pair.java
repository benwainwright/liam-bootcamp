package liam.bootcamp.utils;

public class Pair<T, F> {
    
    private T first;
    private F second;

    public Pair(T first, F second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public F getSecond() {
        return this.second;
    }
}