package com.deliveryBoyApp.deliveryBoy.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.deliveryBoyApp.deliveryBoy.Utils.AppConstants.LOCATION_TOPIC_NAME;


@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(LOCATION_TOPIC_NAME)
                .replicas(1)
                .partitions(4)
                .build();
    }



}
