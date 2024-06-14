package com.cypcode.openfeign_microservice.service;

import com.cypcode.openfeign_microservice.entity.SubscriberDTO;
import com.cypcode.openfeign_microservice.integration.SubscriptionFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    SubscriptionFeignClient feignClient;

    public void sendSubscriptionData(SubscriberDTO payload){
        try{
            feignClient.sendSubscription(payload);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
