package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConsultasFake implements HistoricoConsultas {

    private List<Double> consultas = new ArrayList<>();

    @Override
    public void registrarConsulta(double valorConsulta) {
        consultas.add(valorConsulta);
    }

    @Override
    public List<Double> listarConsultas() {
        return consultas;
    }
}
