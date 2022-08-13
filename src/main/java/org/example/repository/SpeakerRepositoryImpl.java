package org.example.repository;

import org.example.model.Speaker;

import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {

        Speaker s = new Speaker();
        s.setFirstName("Akash");
        s.setLastName("Yadav");

        return List.of(s);
    }

}
