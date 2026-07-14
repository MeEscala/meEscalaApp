package br.iff.edu.ccc.meEscala.dto;

public class PartidaRequest {
    private String titulo;
    private String esporte;
    private Integer maxJogadores;
    private String data;
    private String hora;
    private String localizacao;
    
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