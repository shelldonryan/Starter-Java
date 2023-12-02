package com.shelldonryan.eventregistrationmanagement.dtos;

public record EventRequestDTO(int maxParticipants, String date, String title, String subscription) {
}
