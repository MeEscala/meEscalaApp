package br.iff.edu.ccc.meEscala.service;

import br.iff.edu.ccc.meEscala.model.Partida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartidaService {
    
    private List<Partida> listaDePartidas = new ArrayList<>();

    public void salvar(Partida partida) {
        listaDePartidas.add(partida);
    }

    public List<Partida> listarTodas() {
        return listaDePartidas;
    }
}