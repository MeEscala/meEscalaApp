package br.iff.edu.ccc.meEscala.controller.view;

import br.iff.edu.ccc.meEscala.service.PartidaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class MainViewController {

    @Autowired
    private PartidaUseCase partidaUseCase; // Agora injetamos o UseCase!

    @GetMapping
    public String getPaginaInicial(Model model) {
        // Pega a lista do UseCase e manda para o dashboard.html
        model.addAttribute("partidas", partidaUseCase.listarTodasAsPartidas());
        return "dashboard";
    }
}