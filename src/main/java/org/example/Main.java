package org.example;

import org.example.service.SpeakerService;
import org.example.service.SpeakerServiceImpl;

public class Main {
    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll());
    }
}