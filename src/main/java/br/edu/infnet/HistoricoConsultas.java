package br.edu.infnet;

import java.util.List;

// Exercicio 5
public interface HistoricoConsultas {
    void registrarConsulta(double valorConsulta);

    List<Double> listarConsultas();
}
