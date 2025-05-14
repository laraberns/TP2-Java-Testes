package br.edu.infnet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleTest {
    private Console console;

    @BeforeEach
    void setUp() {
        console = new Console();
    }

    // Exercício 1
    @Test
    void calcularValorReembolsado() {
        double valorReembolsado = console.calcularValorReembolsado(200 , 70);
        assertEquals(140, valorReembolsado);
    }
}