package org.ensaj.voiture.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.Transient;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Data @AllArgsConstructor

@Entity
@Getter @Setter
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;



    public Voiture(String matricule, String marque, String model, client cllient) {
        this.matricule = matricule;
        this.marque = marque;
        this.model = model;
        this.client = client;
    }

    public Voiture() {

    }
}