package md.utm.restaurantmanagement.controller;

import md.utm.restaurantmanagement.entity.Clienti;
import md.utm.restaurantmanagement.repository.ClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clienti")
public class ClientiController {

    @Autowired
    private ClientiRepository clientiRepository;

    @GetMapping
    public List<Clienti> retrieveAll() {
        return clientiRepository.retrieveAll();
    }

    @GetMapping("{idClient}")
    public Clienti retrieveById(@PathVariable int idClient) {
        return clientiRepository.retrieveById(idClient);
    }

    @PostMapping
    public void create(@RequestBody Clienti client) {
        clientiRepository.create(client);
    }

    @PutMapping("{idClient}")
    public void update(@PathVariable int idClient, @RequestBody Clienti client) {
        clientiRepository.update(idClient, client);
    }

    @DeleteMapping("{idClient}")
    public void delete(@PathVariable int idClient) {
        clientiRepository.delete(idClient);
    }
}
