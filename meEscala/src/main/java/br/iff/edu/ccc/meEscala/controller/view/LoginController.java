package br.iff.edu.ccc.meEscala.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // Rota raiz (quando o usuário digita só localhost:8080)
    @GetMapping("/")
    public String getLogin() {
        return "login"; // Você precisará criar um login.html simples depois
    }

    // Rota que simula o botão de "Entrar"
    @PostMapping("/login")
    public String realizarLogin() {
        // Na próxima fase entra a lógica de verificar senha. 
        // Por enquanto, apenas redireciona para o painel.
        return "redirect:/dashboard";
    }

    // Rota para a tela de criar conta
    @GetMapping("/cadastro")
    public String getCadastro() {
        return "cadastro"; 
    }
}