package br.iff.edu.ccc.meEscala.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String realizarLogin() {
        return "redirect:/dashboard";
    }

    @GetMapping("/cadastro")
    public String getCadastro() {
        return "cadastro"; 
    }
}