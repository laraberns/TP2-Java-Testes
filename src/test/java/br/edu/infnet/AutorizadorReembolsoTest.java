package br.edu.infnet;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Exercicio 8
class AutorizadorReembolsoTest {
    private AutorizadorReembolso autorizadorReembolso;

    @BeforeEach
    void init() {
        autorizadorReembolso = mock(AutorizadorReembolso.class);
    }

    @Test
    void deveLancarExcecaoQuandoNaoAutorizado() {
        when(autorizadorReembolso.autorizarReembolso(200, 150))
                .thenThrow(new IllegalArgumentException("Valor de reembolso maior que o limite do paciente"));

        assertThrows(IllegalArgumentException.class, () -> {
            autorizadorReembolso.autorizarReembolso(200, 150);
        });
    }

}