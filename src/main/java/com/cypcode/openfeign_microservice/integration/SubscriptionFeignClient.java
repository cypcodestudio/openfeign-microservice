package com.cypcode.openfeign_microservice.integration;

import com.cypcode.openfeign_microservice.entity.SubscriberDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "subscription", url = "${microservice.base-url}")
public interface SubscriptionFeignClient {
    @PostMapping(value = "${microservice.subscribe.endpoint}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    void sendSubscription(@RequestBody SubscriberDTO payload);

    @GetMapping(value = "${microservice.subscribe.endpoint}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    SubscriberDTO getSubscription(@RequestHeader("Authorization") String token, @RequestBody SubscriberDTO payload);
}
