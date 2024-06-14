package com.cypcode.openfeign_microservice.controller;

import com.cypcode.openfeign_microservice.entity.SubscriberDTO;
import com.cypcode.openfeign_microservice.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("open-feign")
public class HomeController {

    @Autowired
    IntegrationService service;

    @PostMapping
    public ResponseEntity<?> shareFeignData(@RequestBody SubscriberDTO payload){
        service.sendSubscriptionData(payload);
        return ResponseEntity.ok().build();
    }

}
