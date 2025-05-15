package br.edu.infnet;

import java.util.List;

public interface HistoricoConsultas {
    void registrarConsulta(double valorConsulta);
    List<Double> listarConsultas();
}
