package com.shelldonryan.eventregistrationmanagement.domain;

import com.shelldonryan.eventregistrationmanagement.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity(name = "event")
@Table(name = "event")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO eventRequest) {
        this.date = eventRequest.date();
        this.maxParticipants = eventRequest.maxParticipants();
        this.title = eventRequest.title();
        this.description = eventRequest.subscription();
    }

}
