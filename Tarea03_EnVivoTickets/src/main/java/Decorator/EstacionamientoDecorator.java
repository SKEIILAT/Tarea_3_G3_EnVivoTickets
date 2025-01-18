package Decorator;

import AbstractFactory.Ticket;


public class EstacionamientoDecorator extends Decorator {
    
    public EstacionamientoDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Estacionamiento añadido al ticket.");
    }
}
