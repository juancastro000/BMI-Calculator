package dev.juancastro.bmicalculator;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BmiCalculatorTest {

    private final BmiCalculator calculator = new BmiCalculator();

    @Test
    void shouldCalculateBMIForValidPerson() {
        Persona persona = new Persona(70, 1.75);
        double bmi = calculator.calculateBMI(persona);
        assertThat(bmi, closeTo(22.86, 0.01)); // IMC esperado con tolerancia
    }

    @Test
    void shouldThrowExceptionForInvalidPersonData() {
        assertThrows(IllegalArgumentException.class, () -> new Persona(-70, 1.75));
        assertThrows(IllegalArgumentException.class, () -> new Persona(70, -1.75));
        assertThrows(IllegalArgumentException.class, () -> new Persona(0, 1.75));
    }
}

