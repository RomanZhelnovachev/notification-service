package EffectiveMobile.notification_service.service;

import EffectiveMobile.notification_service.dto.RegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    public void send(RegisterEvent event){
        String email = event.email();
        String code = event.code();
        System.out.println("====================");
        System.out.println("ОТПРАВКА КОДА ПОДТВЕРЖДЕНИЯ НА ПОЧТУ");
        System.out.println("====================");
        System.out.println("EMAIL - " + email);
        System.out.println("КОД ПОДТВЕРЖДЕНИЯ - " + code);
        log.info("Код подтверждения - {} отправлен на почту - {}", code, email);
    }
}
