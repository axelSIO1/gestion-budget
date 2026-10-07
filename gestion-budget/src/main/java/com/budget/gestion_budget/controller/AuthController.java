package com.budget.gestion_budget.controller;

import com.budget.gestion_budget.UtilisateurDAO;
import com.budget.gestion_budget.model.Utilisateur;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UtilisateurDAO utilisateurDAO;

    public AuthController(UtilisateurDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    @PostMapping("/login")
    public ResponseEntity<Utilisateur> login(@RequestBody Utilisateur identifiants) {
        List<Utilisateur> resultats = utilisateurDAO.trouverParEmailEtMotPasse(
            identifiants.getEmail(), identifiants.getMotPasse()
        );

        if (resultats.isEmpty()) {
            return ResponseEntity.status(401).build();
        }

        return ResponseEntity.ok(resultats.get(0));
    }
}