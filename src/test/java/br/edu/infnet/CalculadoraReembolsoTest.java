package br.edu.infnet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraReembolsoTest {

    private CalculadoraReembolso calculadora;
    // Exercicio 4
    private Paciente pacienteDummy;
    private ComparaValores comparaValores;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraReembolso();
        pacienteDummy = new Paciente();  // objeto fictício
        comparaValores = new ComparaValores();
    }

    // Exercicio 1 e 10
    @Test
    void deveRetornarReembolsoCorreto() {
        double resultado = calculadora.calcular(200, 70, pacienteDummy);

        comparaValores.comparaValoresMargemErro(resultado, 140.0);
    }

    // Exercicio 2 e 10
    @Test
    void deveRetornarZeroQuandoValorConsultaForZero() {
        double resultado = calculadora.calcular(0, 70, pacienteDummy);

        comparaValores.comparaValoresMargemErro(resultado, 0.0);
    }

    // Exercicio 2 e 10
    @Test
    void deveRetornarZeroQuandoPercentualForZero() {
        double resultado = calculadora.calcular(200, 0, pacienteDummy);

        comparaValores.comparaValoresMargemErro(resultado, 0.0);
    }

    // Exercicio 2 e 10
    @Test
    void deveRetornarValorTotalQuandoPercentualFor100() {
        double resultado = calculadora.calcular(150, 100, pacienteDummy);

        comparaValores.comparaValoresMargemErro(resultado, 150.0);
    }

    @Test
    void deveLancarExcecaoQuandoValorConsultaForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(-100, 50, pacienteDummy);
        });
    }

    @Test
    void deveLancarExcecaoQuandoPercentualForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(100, -10, pacienteDummy);
        });
    }

    @Test
    void deveLancarExcecaoQuandoPercentualForMaiorQue100() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(100, 150, pacienteDummy);
        });
    }
}
