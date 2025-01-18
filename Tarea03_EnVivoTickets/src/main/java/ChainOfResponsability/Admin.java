package ChainOfResponsability;

import java.util.Scanner;

import AbstractFactory.UserPurchase;

public class Admin extends SoporteTecnico implements IPolicyManagement, IPriceManagement, IPromotionManagement, ICalendarManagement{
    private Manejadora next;
    private ICalendarManagement sheduleManagement;
    private IPolicyManagement policyManagement;
    private IPromotionManagement promotionManagement;
    private IPriceManagement priceManagement;
    

    @Override
    public void handle(String request) {
        System.out.println("Admin maneja la solici tud.");
        if (next != null) {
            next.handle(request);
        }
    }

    @Override
    public void definePolicy(int idEvent, String newPolicy) {
        System.out.println("Definir política: " + newPolicy);
    }

    @Override
    public void setPrice(int idEvent, double price) {
        System.out.println("Establecer precio: " + price);
    }

    @Override
    public void setPromotion(int idEvent, String details) {
        System.out.println("Establecer promoción: " + details);
    }

    @Override
    public void rescheduleCalendar(int idEvent, String newDate) {
        System.out.println("Reprogramar calendario a: " + newDate);
    }

    public void modificar_evento(EventHandler e, Scanner sc, UserPurchase up){
        System.out.println("Modificando evento");
        e.actualizar_evento(sc, up);
    }
}
