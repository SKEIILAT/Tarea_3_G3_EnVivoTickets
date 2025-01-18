package Decorator;

import AbstractFactory.Ticket;


public class Decorator {
    protected Ticket ticket;

    public Decorator(Ticket ticket) {
        this.ticket = ticket;
    }

    public void agregarCaracteristica() {
        ticket.agregarCaracteristica();
    }
}
