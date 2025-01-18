package Decorator;

import AbstractFactory.Ticket;


public class TicketConBebida extends Ticket{
    public TicketConBebida(Ticket ticket) {
        super();
        System.out.println("Configuramos el alimento");
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Bebida añadida al ticket.");
    }
}
