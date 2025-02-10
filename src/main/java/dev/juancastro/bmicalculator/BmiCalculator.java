package dev.juancastro.bmicalculator;

public class BmiCalculator {
    public double calculateBMI(Persona persona) {
        return persona.getPeso() / (persona.getAltura() * persona.getAltura());
    }
}