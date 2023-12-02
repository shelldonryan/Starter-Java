package com.shelldonryan.eventregistrationmanagement.services;

import com.shelldonryan.eventregistrationmanagement.dtos.EmailRequestDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "email-service", url = "http://endereco-do-servico-de-email")
public interface EmailServiceClient {

    @PostMapping("/send")
    void sendEmail(@RequestBody EmailRequestDTO emailRequest);
}
