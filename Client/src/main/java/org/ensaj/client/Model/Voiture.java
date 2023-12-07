package org.ensaj.client.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    private Long Id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;
    private Client client;

}
