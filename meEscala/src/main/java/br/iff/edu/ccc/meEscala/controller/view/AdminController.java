package br.iff.edu.ccc.meEscala.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerenciamento")
public class AdminController {

    @GetMapping
    public String getGerenciamento() {
        return "gerenciamento";
    }
}