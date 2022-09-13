package com.wsgc.logistics.configclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ConfigClientController {

    @Value("${wsgc.message}")
    private String message;

    @Value("${wsgc.baseConfig}")
    private String baseConfig;

    public ConfigClientController(){}

    @GetMapping(value = "/properties")
    public ResponseEntity<String> getProperties()
    {
        return new ResponseEntity<String>(message + "and base config is: " + baseConfig, HttpStatus.OK);
    }

}
