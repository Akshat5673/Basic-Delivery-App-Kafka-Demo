package com.deliveryBoyApp.deliveryBoy.Controllers;

import com.deliveryBoyApp.deliveryBoy.Service.KafkaService;
import com.deliveryBoyApp.deliveryBoy.Utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/location")
public class LocationController {

    private final KafkaService service;

    @Autowired
    public LocationController(KafkaService service) {
        this.service = service;
    }

    @PostMapping("/update-location")
    public ResponseEntity<ApiResponse> updateLocation(){
        for(int i=1;i<=100;i++) {
             service.updateLocation("(" + Math.round(Math.random() * 100) + ", " + Math.round(Math.random() * 100) + ")");
        }
        return ResponseEntity.ok(new ApiResponse(Map.of("message","Location Updated"),true));
    }

}
