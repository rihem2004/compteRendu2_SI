package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.entities.Etudiant;
import tn.esprim.gestionfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantRestController {
    @Autowired
    private IEtudiantService etudiantService;
    // http://localhost:8085/tpfoyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8085/tpfoyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(etId);
        return etudiant;
    }
    // http://localhost:8085/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8085/tpfoyer/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removEtudiant(@PathVariable("etudiant-id") Long etId) {
        etudiantService.removeEtudiant(etId);
    }
    // http://localhost:8085/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }
}
