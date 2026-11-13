package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Etudiant;
import tn.esprim.gestionfoyer.entities.Foyer;
import tn.esprim.gestionfoyer.service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")

public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;
    // http://localhost:8089/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }
    // http://localhost:8089/tpfoyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foId) {
        Foyer foyer = foyerService.retrieveFoyer(foId);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removFoyer(@PathVariable("foyer-id") Long foId) {
        foyerService.removeFoyer(foId);
    }
    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-etudiant")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.modifyFoyer(f);
        return foyer;
    }
}
