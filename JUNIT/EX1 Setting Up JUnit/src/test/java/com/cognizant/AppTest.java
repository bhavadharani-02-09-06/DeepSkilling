package com.cognizant;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();

        assertEquals("Hello JUnit", app.greet());
    }
}