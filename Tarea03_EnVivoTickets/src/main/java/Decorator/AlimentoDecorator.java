
package Decorator;

import AbstractFactory.Ticket;

public class AlimentoDecorator extends Decorator {
    
    public AlimentoDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Alimento añadido al ticket.");
    }
}
