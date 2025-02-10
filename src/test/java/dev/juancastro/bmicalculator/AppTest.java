package dev.juancastro.bmicalculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void testMainMethodOutput() {
      
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(new String[]{});

        System.setOut(System.out);

        assertTrue(outContent.toString().contains("El IMC es:"));
    }
}