package br.iff.edu.ccc.meEscala.entities;

public class Partida {
    private String titulo;
    private String esporte;
    private Integer maxJogadores;
    private String data;
    private String hora;
    private String localizacao;

    public Partida() {}

    public Partida(String titulo, String esporte, Integer maxJogadores, String data, String hora, String localizacao) {
        this.titulo = titulo;
        this.esporte = esporte;
        this.maxJogadores = maxJogadores;
        this.data = data;
        this.hora = hora;
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public Integer getMaxJogadores() {
        return maxJogadores;
    }

    public void setMaxJogadores(Integer maxJogadores) {
        this.maxJogadores = maxJogadores;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}