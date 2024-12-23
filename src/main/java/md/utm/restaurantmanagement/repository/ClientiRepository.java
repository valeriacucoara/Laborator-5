package md.utm.restaurantmanagement.repository;

import md.utm.restaurantmanagement.entity.Clienti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientiRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Clienti> retrieveAll() {
        return jdbcTemplate.query("SELECT * FROM clienti", (row, index) -> {
            int idClient = row.getInt("id_client");
            String numePrenume = row.getString("nume_prenume");
            String telefon = row.getString("telefon");

            return new Clienti(idClient, numePrenume, telefon);
        });
    }

    public Clienti retrieveById(int idClient) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM clienti WHERE id_client = ?",
                (row, index) -> {
                    int id = row.getInt("id_client");
                    String numePrenume = row.getString("nume_prenume");
                    String telefon = row.getString("telefon");

                    return new Clienti(id, numePrenume, telefon);
                },
                idClient);
    }

    public void create(Clienti client) {
        jdbcTemplate.update(
                "INSERT INTO clienti (id_client, nume_prenume, telefon) VALUES (?, ?, ?)",
                client.getIdClient(), client.getNumePrenume(), client.getTelefon());
    }

    public void update(int idClient, Clienti client) {
        jdbcTemplate.update(
                "UPDATE clienti SET nume_prenume = ?, telefon = ? WHERE id_client = ?",
                client.getNumePrenume(), client.getTelefon(), idClient);
    }

    public void delete(int idClient) {
        jdbcTemplate.update("DELETE FROM clienti WHERE id_client = ?", idClient);
    }
}
