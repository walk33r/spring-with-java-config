package org.example;

import org.example.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);

        System.out.println(service.findAll());
    }
}