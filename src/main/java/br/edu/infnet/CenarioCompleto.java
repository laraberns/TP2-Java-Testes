package br.edu.infnet;

// Exercicio 12
public class CenarioCompleto {

    public boolean autorizarConsultaComParametrosDependentes(
            PlanoSaude planoSaude,
            AutorizadorReembolso autorizadorReembolso,
            Consulta consulta) {

        double percentualCobertura = planoSaude.getPercentualCobertura();
        boolean autorizado = autorizadorReembolso.autorizarReembolso(
                consulta.getValorConsulta(),
                percentualCobertura
        );

        if (autorizado) {
            System.out.println("Consulta autorizada: " + consulta.getNomePaciente() + " - " + consulta.getNomeMedico());
        } else {
            System.out.println("Consulta não autorizada: " + consulta.getNomePaciente() + " - " + consulta.getNomeMedico());
        }

        return autorizado;
    }
}
