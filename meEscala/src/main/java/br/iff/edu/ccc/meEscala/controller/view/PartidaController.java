package br.iff.edu.ccc.meEscala.controller.view;

import br.iff.edu.ccc.meEscala.model.Partida;
import br.iff.edu.ccc.meEscala.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService; // Injeta o serviço

    @GetMapping("/criar")
    public String getCriarPartida() {
        return "criarPartida";
    }

    @PostMapping("/criar")
    public String salvarPartida(Partida partida) {

        partidaService.salvar(partida);
        
        
        return "redirect:/dashboard";
    }

    @GetMapping("/buscar")
    public String getBuscarPartidas() {
        return "buscar"; 
    }


    @GetMapping("/{id}")
    public String getDetalhesPartida(@PathVariable Long id) {
        return "detalhesPartida"; 
    }
}