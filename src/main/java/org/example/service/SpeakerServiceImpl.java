package org.example.service;

import org.example.model.Speaker;
import org.example.repository.SpeakerRepository;
import org.example.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new SpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
