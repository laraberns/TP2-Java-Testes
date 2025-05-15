package br.edu.infnet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraReembolsoTest {

    private CalculadoraReembolso calculadora;
    // Exercicio 4
    private Paciente pacienteDummy;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraReembolso();
        pacienteDummy = new Paciente();  // objeto fictício
    }

    // Exercicio 1
    @Test
    void deveRetornarReembolsoCorreto() {
        double resultado = calculadora.calcular(200, 70, pacienteDummy);
        assertEquals(140.0, resultado, 0.0001);
    }

    // Exercicio 2
    @Test
    void deveRetornarZeroQuandoValorConsultaForZero() {
        double resultado = calculadora.calcular(0, 70, pacienteDummy);
        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    void deveRetornarZeroQuandoPercentualForZero() {
        double resultado = calculadora.calcular(200, 0, pacienteDummy);
        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    void deveRetornarValorTotalQuandoPercentualFor100() {
        double resultado = calculadora.calcular(150, 100, pacienteDummy);
        assertEquals(150.0, resultado, 0.0001);
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
