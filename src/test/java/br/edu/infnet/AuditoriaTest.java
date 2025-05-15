package br.edu.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Exercicio 7 e 9
class AuditoriaTest {
    static class AuditoriaSpy implements Auditoria {
        private boolean chamada = false;

        @Override
        public void registrarConsulta(Consulta consulta) {
            chamada = true;
        }

        public boolean isChamada() {
            return chamada;
        }
    }

    @Test
    void testRegistrarConsulta() {
        AuditoriaSpy auditoria = new AuditoriaSpy();
        Consulta consulta = ConsultaHelper.criarConsultaPadrao();

        auditoria.registrarConsulta(consulta);
        assertTrue(auditoria.isChamada());
    }

    @Test
    void testRegistrarConsultaComHistorico() {
        HistoricoConsultasFake historico = new HistoricoConsultasFake();
        AuditoriaSpy auditoria = new AuditoriaSpy();
        Consulta consulta = ConsultaHelper.criarConsultaPadrao();

        historico.registrarConsulta(consulta);
        auditoria.registrarConsulta(consulta);

        assertTrue(auditoria.isChamada());
    }

    @Test
    void testRegistrarConsultaComHistoricoVazio() {
        HistoricoConsultasFake historico = new HistoricoConsultasFake();
        AuditoriaSpy auditoria = new AuditoriaSpy();
        Consulta consulta = ConsultaHelper.criarConsultaPadrao();

        auditoria.registrarConsulta(consulta);

        assertTrue(auditoria.isChamada());
    }

}