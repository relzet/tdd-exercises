package com.bobocode;

public interface Stack<T> {
    void push(T element);

    T pop();

    int size();

    boolean isEmpty();
}
