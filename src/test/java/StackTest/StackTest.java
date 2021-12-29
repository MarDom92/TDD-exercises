package StackTest;

import Stack.Stack;
import Stack.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StackTest {
    
    private Stack stack;

    @BeforeEach
    void createStack() {
        stack = new Stack();
    }

    @Test
    public void sizeShouldBeZero() {
        assertEquals(0, stack.size());
    }

    @Test
    public void shouldPushOneElementToStack() {
        stack.add(1);

        assertEquals(1, stack.size());
    }

    @Test
    public void shouldPushTwoElementToStack() {
        stack.add(5);
        stack.add(99);

        assertEquals(2, stack.size());
    }

    @Test
    public void shouldPushAndPeekElementToStack() {
        int i = 5;

        stack.add(i);
        int result = stack.peek();

        assertEquals(i, result);
    }

    @Test
    public void shouldPushAndPopElementToStack() {
        stack.add(5);
        stack.pop();

        assertEquals(0, stack.size());
    }

    @Test
    void shouldBeEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldBeNotEmpty() {
        stack.add(5);

        assertFalse(stack.isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenPeekAndStackIsEmpty() {
        Assertions.assertThrows(EmptyStackException.class,
                () -> {
                    stack.peek();
                });
    }

    @Test
    void shouldThrowExceptionWhenPopAndStackIsEmpty() {
        Assertions.assertThrows(EmptyStackException.class,
                () -> {
                    stack.pop();
                });
    }
}
