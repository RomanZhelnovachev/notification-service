package EffectiveMobile.notification_service.config;

import EffectiveMobile.notification_service.dto.RegisterEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;

@Configuration
@EnableKafka
public class KafkaConfig {

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, RegisterEvent>
    kafkaListenerContainerFactory(ConsumerFactory<String, RegisterEvent> consumerFactory) {

        ConcurrentKafkaListenerContainerFactory<String, RegisterEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }
}