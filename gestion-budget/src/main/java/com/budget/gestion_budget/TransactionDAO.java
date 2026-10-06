package com.budget.gestion_budget;

import com.budget.gestion_budget.model.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TransactionDAO {

    private final JdbcTemplate jdbcTemplate;

    public TransactionDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Convertit une ligne de résultat SQL en objet Transaction
    private RowMapper<Transaction> transactionRowMapper = new RowMapper<Transaction>() {
        @Override
        public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
            Transaction t = new Transaction();
            t.setId(rs.getInt("id_transaction"));
            t.setMontant(rs.getDouble("montant"));
            t.setDate(rs.getDate("date").toLocalDate());
            t.setDescription(rs.getString("description"));
            t.setType(rs.getString("type"));
            t.setIdUtilisateur(rs.getInt("id_utilisateur"));
            t.setIdCategorie(rs.getInt("id_categorie"));
            return t;
        }
    };

    public List<Transaction> listerTransactions() {
        String sql = "SELECT * FROM transaction ORDER BY date DESC";
        return jdbcTemplate.query(sql, transactionRowMapper);
    }

    public void ajouterTransaction(Transaction t) {
        String sql = "INSERT INTO transaction (montant, date, description, type, id_utilisateur, id_categorie) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, t.getMontant(), t.getDate(), t.getDescription(), t.getType(), t.getIdUtilisateur(), t.getIdCategorie());
    }

    public void modifierTransaction(int id, Transaction t) {
    String sql = "UPDATE transaction SET montant = ?, date = ?, description = ?, type = ?, id_utilisateur = ?, id_categorie = ? WHERE id_transaction = ?";
    jdbcTemplate.update(sql, t.getMontant(), t.getDate(), t.getDescription(), t.getType(), t.getIdUtilisateur(), t.getIdCategorie(), id);
}

    public void supprimerTransaction(int id) {
        String sql = "DELETE FROM transaction WHERE id_transaction = ?";
        jdbcTemplate.update(sql, id);
    }
}