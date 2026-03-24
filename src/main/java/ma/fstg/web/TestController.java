package ma.fstg.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/user/profile")
    public String userAccess() {
        return "Bienvenue Utilisateur !! -> C'est pour l'Accès USER ou ADMIN";
    }

    @GetMapping("/admin/dashboard")
    public String adminAccess() {
        return "Bienvenue Administrateur !! -> C'est pour lAccès ADMIN uniquement";
    }

    @GetMapping("/public/info")
    public String publicAccess() {
        return "Ceci est une page publique.";
    }
}

