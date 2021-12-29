package Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> stack = new ArrayList<>();

    public int size() {
        return stack.size();
    }

    public void add(T t) {
        stack.add(t);
    }

    public T peek() {
        int head = getHeadPosition();
        return stack.get(head);
    }

    public void pop() {
        int head = getHeadPosition();
        stack.remove(head);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private int getHeadPosition() {
        if (stack.size() <= 0) {
            throw new EmptyStackException();
        }

        return stack.size() - 1;
    }
}
