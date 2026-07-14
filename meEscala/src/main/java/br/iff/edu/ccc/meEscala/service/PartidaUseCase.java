package br.iff.edu.ccc.meEscala.service;

import br.iff.edu.ccc.meEscala.dto.PartidaRequest;
import br.iff.edu.ccc.meEscala.entities.Partida;
import br.iff.edu.ccc.meEscala.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaUseCase {

    @Autowired
    private PartidaRepository repository;

    public void organizarNovaPartida(PartidaRequest request) {
        
        Partida novaPartida = new Partida(
            request.getTitulo(),
            request.getEsporte(),
            request.getMaxJogadores(),
            request.getData(),
            request.getHora(),
            request.getLocalizacao()
        );
        
        repository.salvar(novaPartida);
    }

    public List<Partida> listarTodasAsPartidas() {
        return repository.listarTodas();
    }
}