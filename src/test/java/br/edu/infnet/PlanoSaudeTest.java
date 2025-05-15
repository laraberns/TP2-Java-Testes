package br.edu.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoSaudeTest {
    static class PlanoSaudeStub implements PlanoSaude {
        @Override
        public double getPercentualCobertura() {
            return 50.0;
        }
    }

    @Test
    void testCalculaPercentualDeCobertura() {
        PlanoSaude planoSaude = new PlanoSaudeStub();
        double percentual = planoSaude.getPercentualCobertura();
        assertEquals(50.0, percentual);
    }
}