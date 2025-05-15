package br.edu.infnet;

public class ComparaValores {
    public void comparaValoresMargemErro(double valor1, double valor2) {
        double margemErro = 0.01;
        double diferenca = Math.abs(valor1 - valor2);
        if (diferenca <= margemErro) {
            System.out.println("Os valores são iguais dentro da margem de erro de " + margemErro);
        } else {
            System.out.println("Os valores são diferentes");
        }
    }
}
