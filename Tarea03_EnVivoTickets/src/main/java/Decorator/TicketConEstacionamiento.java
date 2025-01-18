package Decorator;

import AbstractFactory.Ticket;


public class TicketConEstacionamiento extends Ticket{
    public TicketConEstacionamiento(Ticket ticket) {
        super();
        System.out.println("Configuramos el estacionamiento");
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Estacionamiento añadido al ticket.");
    }
}
