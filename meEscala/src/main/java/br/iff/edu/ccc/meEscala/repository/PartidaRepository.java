package br.iff.edu.ccc.meEscala.repository;

import br.iff.edu.ccc.meEscala.entities.Partida;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository 
public class PartidaRepository {
    
    private List<Partida> listaDePartidas = new ArrayList<>();

    public void salvar(Partida partida) {
        listaDePartidas.add(partida);
    }

    public List<Partida> listarTodas() {
        return listaDePartidas;
    }
}