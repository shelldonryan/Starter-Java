package com.shelldonryan.eventregistrationmanagement.controllers;

import com.shelldonryan.eventregistrationmanagement.domain.Event;
import com.shelldonryan.eventregistrationmanagement.dtos.EventRequestDTO;
import com.shelldonryan.eventregistrationmanagement.dtos.SubscriptionRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.shelldonryan.eventregistrationmanagement.services.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getUpcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register")
    public void registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequest) {
        eventService.registerParticipant(eventId, subscriptionRequest.participantEmail());
    }
}
