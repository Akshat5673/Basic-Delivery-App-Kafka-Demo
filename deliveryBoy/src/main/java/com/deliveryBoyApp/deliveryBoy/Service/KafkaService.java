package com.deliveryBoyApp.deliveryBoy.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.deliveryBoyApp.deliveryBoy.Utils.AppConstants.LOCATION_TOPIC_NAME;

@Service
@Slf4j
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> template;

    public void updateLocation(String location){
            this.template.send(LOCATION_TOPIC_NAME, location);
            log.info("Message Produced! ");
            System.out.println("_________________________________");
    }

}
