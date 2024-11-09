package com.endUser.endUserApp.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.endUser.endUserApp.Utils.AppConstants.GROUP_ID;
import static com.endUser.endUserApp.Utils.AppConstants.LOCATION_UPDATE_TOPIC;

@Configuration
@Slf4j
public class KafkaConsumerConfig {

    @KafkaListener(topics = LOCATION_UPDATE_TOPIC, groupId = GROUP_ID)
    public void updatedLocation(String value){
        log.info(value);
    }

}
