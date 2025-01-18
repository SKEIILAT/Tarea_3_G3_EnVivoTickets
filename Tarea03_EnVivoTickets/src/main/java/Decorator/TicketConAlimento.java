package Decorator;

import AbstractFactory.Ticket;


public class TicketConAlimento extends Ticket{
    public TicketConAlimento(Ticket ticket) {
        super();
        System.out.println("Configuramos el alimento");
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Alimento añadido al ticket.");
    }
}
