package EffectiveMobile.notification_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Сервис отправки кода подтверждения на почту пользователя (в настоящее время выводит логи в консоль)
 *
 * @author ZhelnovachevRoman
 */
@Service
@Slf4j
public class NotificationService {

    /**
     * Метод отправки кода подтверждения на почту пользователя
     * В настоящее время просто выводит логи в консоль
     * @param email
     * @param code
     */
    public void send(String email, String code){
        log.info("=== Отправка кода подтверждения ===");
        log.info("Email: {}", email);
        log.info("Code: {}", code);
        log.info("Код подтверждения {} отправлен на почту {}", code, email);
    }
}
