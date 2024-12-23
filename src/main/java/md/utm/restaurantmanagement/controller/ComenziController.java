package md.utm.restaurantmanagement.controller;

import md.utm.restaurantmanagement.entity.Comenzi;
import md.utm.restaurantmanagement.repository.ComenziRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comenzi")
public class ComenziController {

    @Autowired
    private ComenziRepository comenziRepository;

    @GetMapping
    public List<Comenzi> retrieveAll() {
        return comenziRepository.retrieveAll();
    }

    @GetMapping("{idComanda}")
    public Comenzi retrieveById(@PathVariable int idComanda) {
        return comenziRepository.retrieveById(idComanda);
    }

    @PostMapping
    public void create(@RequestBody Comenzi comanda) {
        comenziRepository.create(comanda);
    }

    @PutMapping("{idComanda}")
    public void update(@PathVariable int idComanda, @RequestBody Comenzi comanda) {
        comenziRepository.update(idComanda, comanda);
    }

    @DeleteMapping("{idComanda}")
    public void delete(@PathVariable int idComanda) {
        comenziRepository.delete(idComanda);
    }
}
