package br.iff.edu.ccc.meEscala.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/dashboard")

public class MainViewController {

    @GetMapping("/dashboard")
    public String getPaginaInicial() {
        return "layoutbase.html";
    }


    @GetMapping("/{id}")
    public String getMethodName(@PathVariable("id") String id, @RequestParam("var1") String param, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("var1", param);

        return "inicial.html";
    }
}
