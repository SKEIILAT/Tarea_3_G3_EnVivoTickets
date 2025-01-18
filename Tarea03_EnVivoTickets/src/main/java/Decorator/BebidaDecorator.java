package Decorator;

import AbstractFactory.Ticket;


public class BebidaDecorator extends Decorator {
    
    public BebidaDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Bebida añadida al ticket.");
    }
}
