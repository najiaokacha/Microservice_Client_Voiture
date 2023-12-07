package org.ensaj.voiture.Controller;


import org.ensaj.voiture.CommunicationVoitureClient.VoitureClient;
import org.ensaj.voiture.Model.Client;
import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.ensaj.voiture.Service.VoitureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VoitureController {


    VoitureRepository voitureRepository;


    VoitureService voitureService;

    VoitureClient clientRest;

    public VoitureController(VoitureRepository voitureRepository, VoitureService voitureService, VoitureClient clientRest) {
        this.voitureRepository = voitureRepository;
        this.voitureService = voitureService;
        this.clientRest = clientRest;
    }

    @GetMapping(value ="/voitures")
    public List<Voiture> chercherVoiture(){
        return voitureRepository.findAll();
    }

    @GetMapping("/voitures/{Id}")
    public Voiture chercherUneVoiture(@PathVariable Long Id) throws Exception{
        Voiture voiture = voitureRepository.findById(Id).get();
        Client client = clientRest.findClientByID(voiture.getClientId());
        voiture.setClient(client);
        return voiture;
    }


    @PostMapping("/voitures")
    public Voiture enregistrerUneVoiture(@RequestBody Voiture voiture){
        return voitureService.enregistrerVoiture(voiture);
    }



}
