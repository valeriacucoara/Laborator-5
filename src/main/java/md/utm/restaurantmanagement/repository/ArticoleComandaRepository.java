package md.utm.restaurantmanagement.repository;

import md.utm.restaurantmanagement.entity.ArticoleComanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticoleComandaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ArticoleComanda> retrieveAll() {
        return jdbcTemplate.query("SELECT * FROM articole_comanda",
                (row, index) -> {
                    int idArticol = row.getInt("id_articol");
                    int idComanda = row.getInt("id_comanda");
                    String numeProdus = row.getString("nume_produs");
                    int cantitate = row.getInt("cantitate");
                    float pret = row.getFloat("pret");

                    return new ArticoleComanda(idArticol, null, numeProdus, cantitate, pret);
                });
    }

    public ArticoleComanda retrieveById(int idArticol) {
        return jdbcTemplate.queryForObject("SELECT * FROM articole_comanda WHERE id_articol = ?",
                (row, index) -> {
                    int idComanda = row.getInt("id_comanda");
                    String numeProdus = row.getString("nume_produs");
                    int cantitate = row.getInt("cantitate");
                    float pret = row.getFloat("pret");

                    return new ArticoleComanda(idArticol, null, numeProdus, cantitate, pret);
                }, idArticol);
    }

    public void create(ArticoleComanda articolComanda) {
        jdbcTemplate.update("INSERT INTO articole_comanda (id_articol, id_comanda, nume_produs, cantitate, pret) VALUES (?, ?, ?, ?, ?)",
                articolComanda.getIdArticol(),
                articolComanda.getComanda().getIdComanda(),
                articolComanda.getNumeProdus(),
                articolComanda.getCantitate(),
                articolComanda.getPret());
    }

    public void update(int idArticol, ArticoleComanda articolComanda) {
        jdbcTemplate.update("UPDATE articole_comanda SET id_comanda = ?, nume_produs = ?, cantitate = ?, pret = ? WHERE id_articol = ?",
                articolComanda.getComanda().getIdComanda(),
                articolComanda.getNumeProdus(),
                articolComanda.getCantitate(),
                articolComanda.getPret(),
                idArticol);
    }

    public void delete(int idArticol) {
        jdbcTemplate.update("DELETE FROM articole_comanda WHERE id_articol = ?", idArticol);
    }
}