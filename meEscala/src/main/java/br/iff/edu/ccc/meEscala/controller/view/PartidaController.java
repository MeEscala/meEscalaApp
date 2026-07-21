package br.iff.edu.ccc.meEscala.controller.view;

import br.iff.edu.ccc.meEscala.dto.PartidaRequest;
import br.iff.edu.ccc.meEscala.service.PartidaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaUseCase partidaUseCase;

    @GetMapping("/criar")
    public String getCriarPartida() {
        return "criarPartida";
    }

    @PostMapping("/criar")
    public String salvarPartida(PartidaRequest request) {
        
        partidaUseCase.organizarNovaPartida(request);
        
        return "redirect:/dashboard";
    }
}