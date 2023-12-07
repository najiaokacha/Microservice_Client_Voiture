package org.ensaj.client.CommunicationClientVoiture;

import org.springframework.cloud.openfeign.FeignClient;




@FeignClient(name = "SERVICE-VOITURE")
public interface ClientVoiture {
//    @GetMapping("/clients")

}