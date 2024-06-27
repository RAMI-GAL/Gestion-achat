package com.example.rami.web.
import com.example.rami.Dao.ProduitDao;
import com.example.rami.services.IProduit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProduitController {
    private final IProduit produitService;

    public ProduitController(IProduit produitService) {
        this.produitService = produitService;
    }

    @PostMapping
    public ResponseEntity<ProduitDao> createCompte(@RequestBody(required = true)  ProduitDao produitDao) {
        ProduitDao createdProduit = produitService.createProduit(produitDao);

        return new ResponseEntity<ProduitDao>(createdProduit, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<ProduitDao> getAllProduit() {
        return produitService.getAllProduit();
    }

    @DeleteMapping(path = "/{idCompte}")
    public ResponseEntity<Void> deleteProduit(@PathVariable int idProduit) throws ResourceNotFoundException {
        if (!produitService.deleteProduit(idProduit)) {
            throw new ResourceNotFoundException("L'élement avec " + idProduit + " est introuvable");
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(path = "/{idProduit}")
    public ResponseEntity<ProduitDao> getProduit(@PathVariable int idProduit) throws ResourceNotFoundException {

        ProduitDao searchedProduit = IProduit.getProduit(idProduit);

        if (searchedProduit == null) {
            throw new ResourceNotFoundException("L'élément avec " + idProduit + " est introuvable");
        }

        return new ResponseEntity<>(searchedProduit, HttpStatus.OK);
    }

    @PutMapping(path = "/{idProduit}")
    public ResponseEntity<ProduitDao> updateproduit(@PathVariable int idProduit,
                                                    @RequestBody(required = true) ProduitDao produitDao) throws ResourceNotFoundException {
        ProduitDao updatedCompte = produitService.updateproduit(idProduit, produitDao);
        if (updatedCompte == null) {
            throw new ResourceNotFoundException("L'élément avec " + idProduit + " est introuvable");
        }
v
        return new ResponseEntity<>(updatedProduit, HttpStatus.OK);
    }


}

