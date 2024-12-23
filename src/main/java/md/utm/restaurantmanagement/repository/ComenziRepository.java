package md.utm.restaurantmanagement.repository;

import md.utm.restaurantmanagement.entity.Comenzi;
import md.utm.restaurantmanagement.entity.Clienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComenziRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Comenzi> retrieveAll() {
        return jdbcTemplate.query("SELECT * FROM comenzi", (row, index) -> {
            int idComanda = row.getInt("id_comanda");
            int idClient = row.getInt("id_client");
            float sumaTotala = row.getFloat("suma_totala");

            Clienti client = new Clienti(idClient, null, null);

            return new Comenzi(idComanda, client, sumaTotala);
        });
    }

    public Comenzi retrieveById(int idComanda) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM comenzi WHERE id_comanda = ?",
                (row, index) -> {
                    int id = row.getInt("id_comanda");
                    int idClient = row.getInt("id_client");
                    float sumaTotala = row.getFloat("suma_totala");

                    Clienti client = new Clienti(idClient, null, null);

                    return new Comenzi(id, client, sumaTotala);
                },
                idComanda);
    }

    public void create(Comenzi comanda) {
        jdbcTemplate.update(
                "INSERT INTO comenzi (id_comanda, id_client, suma_totala) VALUES (?, ?, ?)",
                comanda.getIdComanda(), comanda.getClient().getIdClient(), comanda.getSumaTotala());
    }

    public void update(int idComanda, Comenzi comanda) {
        jdbcTemplate.update(
                "UPDATE comenzi SET id_client = ?, suma_totala = ? WHERE id_comanda = ?",
                comanda.getClient().getIdClient(), comanda.getSumaTotala(), idComanda);
    }

    public void delete(int idComanda) {
        jdbcTemplate.update("DELETE FROM comenzi WHERE id_comanda = ?", idComanda);
    }
}
