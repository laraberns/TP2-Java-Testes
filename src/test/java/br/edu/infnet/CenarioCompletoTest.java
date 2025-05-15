package br.edu.infnet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// Exercicio 12
class CenarioCompletoTest {

    private AutorizadorReembolso autorizadorReembolso;
    private Consulta consulta;

    static class PlanoSaudeStub implements PlanoSaude {
        @Override
        public double getPercentualCobertura() {
            return 50.0;
        }
    }

    @BeforeEach
    void init() {
        autorizadorReembolso = mock(AutorizadorReembolso.class);
        consulta = ConsultaHelper.criarConsultaPadrao();
    }

    @Test
    void testAutorizarConsultaComParametrosDependentes() {
        PlanoSaude planoSaude = new PlanoSaudeStub();
        CenarioCompleto cenarioCompleto = new CenarioCompleto();

        when(autorizadorReembolso.autorizarReembolso(
                consulta.getValorConsulta(), planoSaude.getPercentualCobertura()))
                .thenReturn(true);

        boolean resultado = cenarioCompleto.autorizarConsultaComParametrosDependentes(
                planoSaude, autorizadorReembolso, consulta);

        verify(autorizadorReembolso).autorizarReembolso(
                consulta.getValorConsulta(), planoSaude.getPercentualCobertura());

        assertTrue(resultado);
    }
}
