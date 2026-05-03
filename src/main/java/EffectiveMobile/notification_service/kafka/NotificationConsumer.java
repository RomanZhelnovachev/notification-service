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

    @KafkaListener(topics = "registered", groupId = "notification-service")
    public void listen(RegisterEvent event){
        service.send(event);
        }
    }
