package br.edu.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Exercicio 7
class AuditoriaTest {
    static class AuditoriaSpy implements Auditoria {
        private boolean chamada = false;

        @Override
        public void registrarConsulta() {
            chamada = true;
        }

        public boolean isChamada() {
            return chamada;
        }
    }

    @Test
    void testRegistrarConsulta() {
        AuditoriaSpy auditoria = new AuditoriaSpy();
        auditoria.registrarConsulta();
        assertTrue(auditoria.isChamada());
    }

}