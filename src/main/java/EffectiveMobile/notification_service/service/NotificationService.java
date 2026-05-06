package EffectiveMobile.notification_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    public void send(String email, String code){
        log.info("=== Отправка кода подтверждения ===");
        log.info("Email: {}", email);
        log.info("Code: {}", code);
        log.info("Код подтверждения {} отправлен на почту {}", code, email);
    }
}
