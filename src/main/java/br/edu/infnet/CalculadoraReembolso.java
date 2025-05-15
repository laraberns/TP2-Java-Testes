package br.edu.infnet;

public class CalculadoraReembolso {

    // Exercicios 1, 3 e 4
    public double calcular(double valorConsulta, double percentualCobertura, Paciente paciente) {
        if (valorConsulta < 0 || percentualCobertura < 0 || percentualCobertura > 100) {
            throw new IllegalArgumentException("Valores inválidos");
        }
        return valorConsulta * (percentualCobertura / 100);
    }
}
