package org.example;

import org.example.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service1 = appContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service1.hashCode());

        SpeakerService service2 = appContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service2.hashCode());

        System.out.println(service1.findAll());
    }
}