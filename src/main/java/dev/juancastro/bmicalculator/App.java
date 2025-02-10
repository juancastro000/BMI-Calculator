package dev.juancastro.bmicalculator;


public class App {
    public static void main(String[] args) {
        Persona persona = new Persona(70, 1.75);
        BmiCalculator calculator = new BmiCalculator();
        
        double bmi = calculator.calculateBMI(persona);
        System.out.println("El IMC es: " + bmi);
    }
}