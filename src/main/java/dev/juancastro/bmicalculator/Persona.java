package dev.juancastro.bmicalculator;

public class Persona {
    private final double peso;  
    private final double altura; 

    public Persona(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso y altura deben ser mayores que cero");
        }
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}

