package br.edu.infnet;

import java.util.List;

// Exercicio 5
public interface HistoricoConsultas {

    void registrarConsulta(Consulta consulta);

    List<Consulta> listarConsultas();
}
