package org.example;

import org.example.repository.SpeakerRepository;
import org.example.repository.SpeakerRepositoryImpl;
import org.example.service.SpeakerService;
import org.example.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepositoryImpl();
    }

}


