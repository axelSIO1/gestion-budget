package com.budget.gestion_budget;

import com.budget.gestion_budget.model.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UtilisateurDAO {

    private final JdbcTemplate jdbcTemplate;

    public UtilisateurDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Utilisateur> utilisateurRowMapper = new RowMapper<Utilisateur>() {
        @Override
        public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
            Utilisateur u = new Utilisateur();
            u.setId(rs.getInt("id_utilisateur"));
            u.setNom(rs.getString("nom"));
            u.setEmail(rs.getString("email"));
            u.setMotPasse(rs.getString("mot_passe"));
            return u;
        }
    };

    public List<Utilisateur> trouverParEmailEtMotPasse(String email, String motPasse) {
        String sql = "SELECT * FROM utilisateur WHERE email = ? AND mot_passe = ?";
        return jdbcTemplate.query(sql, utilisateurRowMapper, email, motPasse);
    }
}