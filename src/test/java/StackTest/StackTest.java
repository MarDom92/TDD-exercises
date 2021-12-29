package StackTest;

import Stack.Stack;
import Stack.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StackTest {

    @Test
    public void sizeShouldBeZero() {
        Stack<Integer> stack = new Stack<Integer>();

        assertEquals(0, stack.size());
    }

    @Test
    public void shouldPushOneIntegerElementToStack() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(1);

        assertEquals(1, stack.size());
    }

    @Test
    public void shouldPushOneDoubleElementToStack() {
        Stack<Double> stack = new Stack<Double>();

        stack.add(15.919191);

        assertEquals(1, stack.size());
    }

    @Test
    public void shouldPushOneStringElementToStack() {
        Stack<String> stack = new Stack<String>();

        stack.add("example string stack test");

        assertEquals(1, stack.size());
    }

    @Test
    public void shouldPushTwoElementToStack() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(5);
        stack.add(99);

        assertEquals(2, stack.size());
    }

    @Test
    public void shouldPushFiveDifferentElementToStack() {
        Stack<Object> stack = new Stack<>();

        stack.add(1);
        stack.add("sad");
        stack.add(-5.0);
        stack.add('c');
        stack.add(true);

        assertEquals(5, stack.size());
    }

    @Test
    public void shouldPushAndPeekElementToStack() {
        Stack<Integer> stack = new Stack<Integer>();

        int i = 1;

        stack.add(i);
        Object result = stack.peek();

        assertEquals(i, result);
    }

    @Test
    public void shouldPushAndPopElementToStack() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(5);
        stack.pop();

        assertEquals(0, stack.size());
    }

    @Test
    void shouldBeEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldBeNotEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(5);

        assertFalse(stack.isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenPeekAndStackIsEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        Assertions.assertThrows(EmptyStackException.class,
                () -> {
                    stack.peek();
                });
    }

    @Test
    void shouldThrowExceptionWhenPopAndStackIsEmpty() {
        Stack<Integer> stack = new Stack<Integer>();

        Assertions.assertThrows(EmptyStackException.class,
                () -> {
                    stack.pop();
                });
    }
}
