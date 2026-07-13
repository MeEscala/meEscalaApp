package br.iff.edu.ccc.meEscala.controller.view;

import br.iff.edu.ccc.meEscala.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class MainViewController {

    @Autowired
    private PartidaService partidaService; 

    @GetMapping
    public String getPaginaInicial(Model model) {
        // Pega a lista do serviço e manda para o dashboard.html
        model.addAttribute("partidas", partidaService.listarTodas());
        return "dashboard";
    }
}