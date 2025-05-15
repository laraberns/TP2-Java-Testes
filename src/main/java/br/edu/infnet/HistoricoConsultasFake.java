package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

// Exercicio 5
public class HistoricoConsultasFake implements HistoricoConsultas {

    private List<Consulta> consultas = new ArrayList<>();

    @Override
    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public List<Consulta> listarConsultas() {
        return consultas;
    }
}
