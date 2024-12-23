package md.utm.restaurantmanagement.controller;
import md.utm.restaurantmanagement.entity.ArticoleComanda;
import md.utm.restaurantmanagement.repository.ArticoleComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articole-comanda")
public class ArticoleComandaController {

    @Autowired
    private ArticoleComandaRepository articoleComandaRepository;

    @GetMapping
    public List<ArticoleComanda> retrieveAll() {
        return articoleComandaRepository.retrieveAll();
    }

    @GetMapping("/id")
    public ArticoleComanda retrieveById(@RequestParam int idArticol) {
        return articoleComandaRepository.retrieveById(idArticol);
    }

    @PostMapping
    public void create(@RequestBody ArticoleComanda articolComanda) {
        articoleComandaRepository.create(articolComanda);
    }

    @PutMapping
    public void update(@RequestParam int idArticol, @RequestBody ArticoleComanda articolComanda) {
        articoleComandaRepository.update(idArticol, articolComanda);
    }

    @DeleteMapping
    public void delete(@RequestParam int idArticol) {
        articoleComandaRepository.delete(idArticol);
    }
}


