package org.example.repository;

import org.example.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {

        Speaker s = new Speaker();
        s.setFirstName("Akash");
        s.setLastName("Yadav");

        return List.of(s);
    }

}
