package com.shelldonryan.eventregistrationmanagement.exceptions;

public class EventNotFoundException extends RuntimeException{
    public EventNotFoundException() {
        super("Evento não encontrado");
    }

    public EventNotFoundException(String msg) {
        super(msg);
    }
}
