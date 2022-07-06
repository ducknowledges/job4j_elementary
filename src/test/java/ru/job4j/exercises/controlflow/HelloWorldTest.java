package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void checkNumberHelloWorld() {
        String s = HelloWorld.checkNumber(15);
        assertEquals(s, "Hello, World!!!");
    }

    @Test
    public void checkNumberHello() {
        String s = HelloWorld.checkNumber(9);
        assertEquals(s, "Hello");
    }

    @Test
    public void checkNumberWorld() {
        String s = HelloWorld.checkNumber(25);
        assertEquals(s, "World");
    }

    @Test
    public void checkNumberDefault() {
        String s = HelloWorld.checkNumber(14);
        assertEquals(s, "Operation not support");
    }
}