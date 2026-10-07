package com.budget.gestion_budget.controller;

import com.budget.gestion_budget.TransactionDAO;
import com.budget.gestion_budget.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    private final TransactionDAO transactionDAO;

    public TransactionController(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionDAO.listerTransactions();
    }

    @PostMapping
    public void ajouterTransaction(@RequestBody Transaction transaction) {
        transactionDAO.ajouterTransaction(transaction);
    }
    

    @PutMapping("/{id}")
    public void modifierTransaction(@PathVariable int id, @RequestBody Transaction transaction) {
        transactionDAO.modifierTransaction(id, transaction);
    }

    @DeleteMapping("/{id}")
    public void supprimerTransaction(@PathVariable int id) {
        transactionDAO.supprimerTransaction(id);
    }
}