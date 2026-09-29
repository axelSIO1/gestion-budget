package com.budget.gestion_budget.model;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private double montant;
    private LocalDate date;
    private String description;
    private String type;
    private int idUtilisateur;
    private int idCategorie;

    public Transaction() {}

    public Transaction(int id, double montant, LocalDate date, String description, String type, int idUtilisateur, int idCategorie) {
        this.id = id;
        this.montant = montant;
        this.date = date;
        this.description = description;
        this.type = type;
        this.idUtilisateur = idUtilisateur;
        this.idCategorie = idCategorie;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getIdUtilisateur() { return idUtilisateur; }
    public void setIdUtilisateur(int idUtilisateur) { this.idUtilisateur = idUtilisateur; }

    public int getIdCategorie() { return idCategorie; }
    public void setIdCategorie(int idCategorie) { this.idCategorie = idCategorie; }
}