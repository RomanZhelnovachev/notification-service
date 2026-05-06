package EffectiveMobile.notification_service.kafka;

import EffectiveMobile.notification_service.dto.RegisterEvent;
import EffectiveMobile.notification_service.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationConsumer {

    private final NotificationService service;

    @KafkaListener(topics = "${app.kafka.topics.registered}")
    public void listen(RegisterEvent event) {
        System.out.println("Received event: " + event);
        service.send(event.email(), event.code());
    }
}