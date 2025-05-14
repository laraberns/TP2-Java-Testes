package br.edu.infnet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraReembolsoTest {
    private CalculadoraReembolso calculadoraReembolso;
    private Paciente pacienteDummy;

    @BeforeEach
    void setUp() {
        calculadoraReembolso = new CalculadoraReembolso();
    }

    // Exercício 1
    @Test
    void deveCalcularValorReembolsado() {
        double valorReembolsado = calculadoraReembolso.calcularValorReembolsado(200, 70, pacienteDummy);
        assertEquals(140, valorReembolsado);
    }

    // Exercício 2
    @Test
    void deveRetornarValorTotalQuandoPercentualFor100() {
        double valorReembolsado = calculadoraReembolso.calcularValorReembolsado(200, 100, pacienteDummy);
        assertEquals(200, valorReembolsado);
    }

    @Test
    void deveRetornarZeroQuandoPercentualForZero() {
        double valorReembolsado = calculadoraReembolso.calcularValorReembolsado(200, 0, pacienteDummy);
        assertEquals(0, valorReembolsado);
    }

    @Test
    void deveRetornarZeroQuandoValorConsultaForZero() {
        double valorReembolsado = calculadoraReembolso.calcularValorReembolsado(0, 100, pacienteDummy);
        assertEquals(0, valorReembolsado);
    }

    @Test
    void deveRetornar100QuandoValorEPercentualForem100() {
        double valorReembolsado = calculadoraReembolso.calcularValorReembolsado(100, 100, pacienteDummy);
        assertEquals(100, valorReembolsado);
    }
}