package com.shelldonryan.eventregistrationmanagement.services;

import com.shelldonryan.eventregistrationmanagement.domain.Event;
import com.shelldonryan.eventregistrationmanagement.domain.Subscription;
import com.shelldonryan.eventregistrationmanagement.dtos.EmailRequestDTO;
import com.shelldonryan.eventregistrationmanagement.dtos.EventRequestDTO;
import com.shelldonryan.eventregistrationmanagement.repositories.EventRepository;
import com.shelldonryan.eventregistrationmanagement.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shelldonryan.eventregistrationmanagement.exceptions.EventNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    private EmailServiceClient emailServiceClient;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getUpcomingEvents() {
        return eventRepository.findUpcomingEvents(LocalDateTime.now());
    }

    public Event createEvent(EventRequestDTO eventRequest) {
        Event newEvent = new Event(eventRequest);
        return eventRepository.save(newEvent);
    }

    public void registerParticipant(String eventId,String participantEmail) {
        Event event = eventRepository.findById(eventId).orElseThrow(EventNotFoundException::new);

        Subscription subscription = new Subscription(event, participantEmail);
        subscriptionRepository.save(subscription);

        EmailRequestDTO emailRequest = new EmailRequestDTO(participantEmail, "cofirmação de inscrição", "Você foi inscrito no evento com sucesso!");

        emailServiceClient.sendEmail(emailRequest);
    }
}
