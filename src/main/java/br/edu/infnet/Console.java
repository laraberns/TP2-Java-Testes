package br.edu.infnet;

public class Console {
    // Exercício 1
    public double calcularValorReembolsado(double valorFixo, double percentualReembolso){
        if(valorFixo < 0 || percentualReembolso < 0 || percentualReembolso > 100){
            throw new IllegalArgumentException("Valores inválidos");
        }
        return valorFixo * (percentualReembolso / 100);
    }
}
