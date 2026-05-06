package EffectiveMobile.notification_service.kafka;

import EffectiveMobile.notification_service.dto.RegisterEvent;
import EffectiveMobile.notification_service.service.NotificationService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class NotificationConsumerTest {

    @Mock
    private NotificationService service;

    @InjectMocks
    private NotificationConsumer consumer;

    @Test
    @DisplayName("Проверка вызова метода сервиса")
    void listen() {
        RegisterEvent event = new RegisterEvent("1", "test@test.com", "0001", Instant.now());
        consumer.listen(event);
        verify(service, times(1)).send("test@test.com", "0001");
    }
}