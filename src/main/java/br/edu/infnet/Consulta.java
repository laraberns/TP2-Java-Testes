package br.edu.infnet;

public class Consulta {
    private String nomePaciente;
    private String nomeMedico;
    private String especialidade;
    private double valorConsulta;
    private String dataConsulta;

    public Consulta(String nomePaciente, String nomeMedico, String especialidade, double valorConsulta, String dataConsulta) {
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }
}
