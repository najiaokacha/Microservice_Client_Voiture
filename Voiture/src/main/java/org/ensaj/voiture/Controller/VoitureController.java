package org.ensaj.voiture.Controller;


import org.ensaj.voiture.CommunicationVoitureClient.VoitureClient;
import org.ensaj.voiture.Model.Client;
import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.ensaj.voiture.Service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepository;
    @Autowired
    VoitureService voitureService;
    @Autowired
    VoitureClient clientRest;

    public VoitureController(VoitureRepository voitureRepository, VoitureService voitureService, VoitureClient clientRest) {
        this.voitureRepository = voitureRepository;
        this.voitureService = voitureService;
        this.clientRest = clientRest;
    }

    @GetMapping(value = "/voitures", produces = {"application/json"})
    public ResponseEntity<Object> chercherVoiture() {
        List<Voiture> voitures = voitureRepository.findAll();
        return ResponseEntity.ok(voitures);
    }

    @GetMapping("/voitures/{Id}")
    public ResponseEntity<Object> chercherUneVoiture(@PathVariable Long Id) throws Exception {
        Voiture voiture = voitureRepository.findById(Id)
                .orElseThrow(() -> new Exception("Voiture Introuvable"));
        Client client = clientRest.findClientByID(voiture.getClient().getId());
        voiture.setClient(client);
        return ResponseEntity.ok(voiture);
    }
}
