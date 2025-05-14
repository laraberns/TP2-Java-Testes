package br.edu.infnet;

public class CalculadoraReembolso {
    public double calcularValorReembolsado(double valorFixo, double percentualReembolso, Paciente paciente){
        if(valorFixo < 0 || percentualReembolso < 0 || percentualReembolso > 100){
            throw new IllegalArgumentException("Valores inválidos");
        }
        return valorFixo * (percentualReembolso / 100);
    }
}
